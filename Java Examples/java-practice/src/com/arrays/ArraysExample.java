package com.arrays;
import java.util.Arrays;
public class ArraysExample {
	 public static void main(String args[]) {
	      //Creating an array
	      int[] myArray = {1,2,3,4,5};
	      System.out.println(myArray[4]);
	      String str[]= {"a","b","c"};
	      System.out.println(Arrays.toString(str));
	      String strs[]= {"a","b","c"};
	      String str1[][]= {{"kalpana","ithagoni"},{"anjali","gunduka"}};
	      String str2[][]= {{"sai","pavan"},{"mani","sai"}};
	      System.out.println(Arrays.deepToString(str1));
	      //equals single array
	      if(Arrays.equals(str, strs))
	    	  System.out.println("equals");
	      else
	    	  System.out.println("not equals");
	    //equals double array
	      if(Arrays.deepEquals(str1, str2))
	    	  System.out.println("equals");
	      else
	    	  System.out.println("not equals");
	 }
}
