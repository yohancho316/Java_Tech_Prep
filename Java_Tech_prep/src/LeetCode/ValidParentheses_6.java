package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class ValidParentheses_6 {

    public static boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<Character>();
        HashSet<Character> open = new HashSet<Character>();
        HashMap<Character,Character> close = new HashMap<Character,Character>();

        open.add('(');
        open.add('{');
        open.add('[');

        close.put('}', '{');
        close.put(')','(');
        close.put(']','[');



        for(int i = 0; i < s.length(); i++) {

            if(open.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if(close.containsKey(s.charAt(i)) && (!(stack.isEmpty()))) {
                if(close.get(s.charAt(i)) != stack.pop()) return false;
            } else {
                return false;
            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "((((";
        System.out.println(isValid(s));
    }
}
