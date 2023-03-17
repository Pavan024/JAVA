package UnCheckedExceptions;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExcp {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
	try{
		System.out.println(x); //ArrayIndexOutOfBoundsException  
      }
    catch(ArrayIndexOutOfBoundsException e){
  	  System.out.println("ArrayIndexOutOfBounds Exception");
    }
	}
}
