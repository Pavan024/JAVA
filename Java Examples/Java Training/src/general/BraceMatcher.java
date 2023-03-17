package general;

import java.util.Stack;

public class BraceMatcher {
    public static boolean isBraceMatch(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[({[]})]{[(]})";
        if (isBraceMatch(str)) {
            System.out.println("Braces match");
        } else {
            System.out.println("Braces do not match");
        }
    }
}

