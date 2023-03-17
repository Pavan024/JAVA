package UnCheckedExceptions;

import java.util.Scanner;

public class ArithmeticExcp {
	public static void main (String args[]){
		int a=5;
		int b=0;
		try{
	          System.out.println(a/b);//ArithmeticException
	        }
	      catch(ArithmeticException e){
	    	  System.out.println("can't be divide by zero");
	      }
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.print(x+y);
		}
}
