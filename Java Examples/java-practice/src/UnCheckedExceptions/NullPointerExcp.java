package UnCheckedExceptions;

public class NullPointerExcp {
	public static void main (String args[]){
	String s=null;  
	try{
		System.out.println(s.length());//NullPointerException  
      }
    catch(NullPointerException e){
  	  System.out.println("s can't be null");
    }
	
}
}
