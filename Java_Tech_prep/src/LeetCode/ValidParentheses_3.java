package LeetCode;
import java.util.Stack;

public class ValidParentheses_3 {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        if(s.length() == 1) return false;

        for(int i = 0; i < s.length(); i++) {

            Character current = s.charAt(i);

            if(current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if(stack.isEmpty()) {
                return false;
            } else if(current == ')' && stack.pop() != '(') {
                return false;
            } else if(current == ']' && stack.pop() != '[') {
                return false;
            } else if(current == '}' && stack.pop() != '{') {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[]";
        System.out.println(isValid(s));
    }
}
