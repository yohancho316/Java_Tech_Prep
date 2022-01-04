/*
URL: https://leetcode.com/problems/valid-parentheses/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(N)
 */


package LeetCode;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        // Local Declarations
        Stack<Character> stack = new Stack<>();

        // Check if S is Empty or Null
        if(s.length() == 0 || s == null) return false;

        // Check if the First Character is a Closing Character
        if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') return false;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if((stack.size() == 0) || (s.charAt(i) == ')' && stack.pop() != '(') ||
                        (s.charAt(i) == ']' && stack.pop() != '[') ||
                        (s.charAt(i) == '}' && stack.pop() != '{')) {
                    return false;
                }
            }
        }

        if(stack.size() > 0) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(s + " = " + Boolean.toString(isValid(s)));
    }
}
