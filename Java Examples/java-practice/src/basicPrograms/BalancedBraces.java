package basicPrograms;

import java.util.Deque;   
import java.util.LinkedList;   
import java.util.Scanner;   
   
//create class BalancedParenthesesExample3 for implementing Balanced Parentheses using Deque   
public class BalancedBraces {   
      
    // main() method start   
    public static void main(String[] args)   
    {   
          
        String inputStr;   
          
        // create an empty deque using LinkedList   
        Deque<Character> deque = new LinkedList<>();   
          
        // create an instance of Scanner class   
        Scanner sc = new Scanner(System.in);   
          
        System.out.print("Enter an expression to check whether it is balanced or not: \n");   
        inputStr = sc.nextLine();   
          
        // close Scanner class object   
        sc.close();   
          
        //iterate input string using for   
        for(char ch : inputStr.toCharArray()) {   
            // add element to deque if ch = '{', ch = '[', or ch = '('   
            if(ch == '{' || ch == '[' || ch == '(') {   
                deque.add(ch);   
            } else {   
                // if deque is not empty   
                if(! deque.isEmpty()) {   
                    if((deque.peekFirst() == '{' && ch == '}')   
                       || (deque.peekFirst() == '[' && ch == ']')   
                       || (deque.peekFirst() == '(' && ch == ')')) {   
                           deque.removeFirst();   
                       }   
                }else {   
                    System.out.println("\nUnbalanced Parentheses2.");   
                }   
            }   
        }   
        System.out.println("\nBalanced Parentheses.");   
    }   
}   
