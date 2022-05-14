package LeetCode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString_1 {

    public static String removeDuplicates(String s) {

        if(s.length() == 1) return s;

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if(stack.isEmpty()) {
                stack.push(current);
                continue;
            }

            if (current == stack.peek()) {
                stack.pop();
                continue;
            } else {
                stack.push(current);
            }
        }

        if(stack.isEmpty()) return "";

        String str = "";
        while(!stack.isEmpty()) {
            str = stack.pop() + str;
        }

        return str;
    }

    public static void main(String[] args) {
        String s = "abbac";
        System.out.println(removeDuplicates(s));
    }
}
