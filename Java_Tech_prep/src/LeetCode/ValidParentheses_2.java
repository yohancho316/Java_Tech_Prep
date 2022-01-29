package LeetCode;
import java.util.Stack;

public class ValidParentheses_2 {

    public static boolean isValid(String s) {

        // Local Declarations
        Stack<Character> stack = new Stack<>();

        // Check the First Character in String s
        Character first = s.charAt(0);
        if(first == ']' || first == ')' || first == '}') return false;

        // Iterate through the Characters of the String s
        for(int i = 0; i < s.length(); i++) {

            // Grab the Current Character
            Character current = s.charAt(i);

            if(current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {

                if(stack.isEmpty()) return false;

                if(current == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if(current == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if(current == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if(stack.isEmpty()) return true;

        return false;
    }


    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(isValid(s));
    }
}
