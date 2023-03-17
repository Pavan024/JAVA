package strings;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class DRFClient {
	
  public static void main(String[] args) {
    try {
      String apiURL = "http://127.0.0.1:8000/nda/digital/";
      File file = new File(File.separator+ "‪Training" + File.separator + "file.pdf");
      String boundary = "===" + System.currentTimeMillis() + "===";

      URL url = new URL(apiURL);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setDoOutput(true);
      conn.setDoInput(true);
      conn.setUseCaches(false);
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Connection", "Keep-Alive");
      conn.setRequestProperty("User-Agent", "Java");
      conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

      DataOutputStream out = new DataOutputStream(conn.getOutputStream());

      out.writeBytes("--" + boundary + "\r\n");
      out.writeBytes("Content-Disposition: form-data; name=\"file\"; filename=\"" + file.getName() + "\"\r\n");
      out.writeBytes("\r\n");

      FileInputStream fileInputStream = new FileInputStream(file);
      int bytesAvailable = fileInputStream.available();
      int maxBufferSize = 1024 * 1024;
      int bufferSize = Math.min(bytesAvailable, maxBufferSize);
      byte[] buffer = new byte[bufferSize];

      int bytesRead = fileInputStream.read(buffer, 0, bufferSize);
      while (bytesRead > 0) {
        out.write(buffer, 0, bufferSize);
        bytesAvailable = fileInputStream.available();
        bufferSize = Math.min(bytesAvailable, maxBufferSize);
        bytesRead = fileInputStream.read(buffer, 0, bufferSize);
      }

      out.writeBytes("\r\n");
      out.writeBytes("--" + boundary + "--\r\n");

      fileInputStream.close();
      out.flush();
      out.close();

      int responseCode = conn.getResponseCode();
      System.out.println("Response Code: " + responseCode);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
