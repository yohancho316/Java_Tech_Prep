/*
URL: https://www.codewars.com/kata/52774a314c2333f0a7000688
Difficulty: 5-Kyu
Time Complexity: O(N)
Space Complexity: O(N)
 */

package CodeWars;
import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {

        // Local Declarations
        Stack<Character> my_stack = new Stack<>();

        for(int i = 0; i < parens.length(); i++) {
            if(parens.charAt(i) == ')' && my_stack.isEmpty()) {
                return false;
            } else if(parens.charAt(i) == '(') {
                my_stack.push(parens.charAt(i));
            } else if(parens.charAt(i) == ')' && my_stack.peek() == '(') {
                my_stack.pop();
            }
        }

        if(my_stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "())";
        System.out.println(validParentheses(str));
    }
}
