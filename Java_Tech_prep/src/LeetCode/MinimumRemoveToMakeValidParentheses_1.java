// Medium Difficulty
package LeetCode;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses_1 {

    public static String minRemoveToMakeValid(String s) {

        if((s.isEmpty()) || (!s.contains("(") && !s.contains(")"))) {
            return s;
        }

        Stack<Character> parentheses_stack = new Stack<Character>();
        Stack<Integer> pos_stack = new Stack<Integer>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(') {
                parentheses_stack.push(current);
                pos_stack.push(i);
            } else if(current == ')' && parentheses_stack.isEmpty()) {
                parentheses_stack.push(current);
                pos_stack.push(i);
            } else if(current == ')' && !parentheses_stack.isEmpty()) {
                if(parentheses_stack.peek() == '(') {
                    parentheses_stack.pop();
                    pos_stack.pop();
                } else {
                    parentheses_stack.push(current);
                    pos_stack.push(i);
                }
            }
        }

        if(parentheses_stack.isEmpty() && pos_stack.isEmpty()) return s;

        while(!parentheses_stack.isEmpty()) {

            if(pos_stack.peek() == 0) {
                s = s.substring(1);
            } else if(pos_stack.peek() == s.length() - 1) {
                s = s.substring(0, s.length() - 1);
            } else {
                s = s.substring(0, pos_stack.peek()) + s.substring(pos_stack.peek() + 1);
            }
            parentheses_stack.pop();
            pos_stack.pop();
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "))((";
        System.out.println(minRemoveToMakeValid(s));

    }
}
