package serialization_deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class SerializationExample {
    public static void main(String[] args) {
        try {
            StudentInfo si = new StudentInfo("Pavan", 101, "tenth");
            FileOutputStream file = new FileOutputStream("D:/student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(si.getName());
            System.out.println("Data stored in the file");
            System.out.println("Student Name : " + si.getName());
            System.out.println("Roll no : " + si.getrNo());
            System.out.println("Standard : " + si.getStandard());
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
