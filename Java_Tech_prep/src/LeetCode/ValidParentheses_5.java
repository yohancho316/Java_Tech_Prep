package LeetCode;

import java.util.HashSet;
import java.util.Stack;

public class ValidParentheses_5 {

    public static boolean isValid(String s) {
        if(s.isEmpty() || s.length() == 1) return false;
        Stack<Character> stack = new Stack<Character>();
        HashSet<Character> open = new HashSet<Character>();
        HashSet<Character> close = new HashSet<Character>();

        open.add('(');
        open.add('{');
        open.add('[');

        close.add(')');
        close.add('}');
        close.add(']');

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(open.contains(current)) {
                stack.push(current);
            } else if(close.contains(current) && !stack.isEmpty()) {
                char top = stack.pop();
                if(current == ')' && top == '(') continue;
                else if(current == '}' && top == '{') continue;
                else if(current == ']' && top == '[') continue;
                else return false;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{])";
        System.out.println(isValid(s));
    }
}
