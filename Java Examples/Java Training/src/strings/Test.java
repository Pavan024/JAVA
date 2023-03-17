package strings;

import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
//		Write a java program To check if given array is fibonacci series or not 3
//		input array of numbers and o/p is Yes or No
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 -- Yes
//		0,1,1,2,3,5,9,13 -- No
		int[] input1 = {0,1,1,2,3,5,8,13,21,34,55};
		int[] input2 = {0,1,1,2,3,5,9,13};
		
		int n = input2.length;
		int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        int count = 0;
        for (int i = 0; i < input2.length; i++) {
			if(fib[i] == input2[i] ) {
				count += 1;
			}
		}
        if(count == input2.length) 
        	System.out.println("fibonacci");
        else
        	System.out.println("Not fibonacci");
        System.out.println("-----------------------");
//		String to char array
		String str = "pavan";
		char[] chr = str.toCharArray();
		System.out.println(chr);
		System.out.println("------------------------");
		
		String str1 = "xbfwqgeb193ab\fmsflse2843rf?/./.;lu98,aiqd";
		System.out.println(str1.charAt(0));
		System.out.println(str1.compareTo("nldhskdmwod"));
		System.out.println(str1.compareToIgnoreCase("nldhskdmwod"));
		System.out.println(str1.concat(str1));
		System.out.println(str1.contains("\\fmsflse2843rf?"));
		System.out.println(str1.equals("nldhskdmwod"));
		System.out.println(str1.equalsIgnoreCase("nldhskdmwod"));
		System.out.println(str1.indexOf(0));
		
	}

}
