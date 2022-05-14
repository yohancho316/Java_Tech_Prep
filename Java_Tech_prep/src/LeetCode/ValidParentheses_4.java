package LeetCode;
import java.util.Stack;

public class ValidParentheses_4 {

    public static boolean isValid(String s) {

        if(s.length() == 1 || (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')) return false;

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if(curr == '{' || curr == '[' || curr == '(') {
                stack.push(curr);
            } else {
                if(stack.size() == 0) {
                    return false;
                } else {
                    char compare = stack.pop();
                    if((compare == '{' && curr == '}') || (compare == '[' && curr == ']') || (compare == '(' && curr == ')')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }

        if(stack.size() > 0) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }
}
