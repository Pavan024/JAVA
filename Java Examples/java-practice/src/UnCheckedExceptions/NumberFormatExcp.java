package UnCheckedExceptions;
public class NumberFormatExcp {
public static void main (String args[]){
	String s="abc";  
	
	try{
		int i=Integer.parseInt(s);  //NumberFormatException 
	}
    catch(NumberFormatException e){
  	  System.out.println("can't convert string variable into number");
    }
}
}
