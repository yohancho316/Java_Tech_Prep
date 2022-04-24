package LeetCode;
import java.util.Stack;

public class SuperReducedString_1 {

    public static String superReducedString(String s) {

        String str = "";
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));

        if(s.length() == 1) return s;

        for(int i = 1; i < s.length(); i++) {
            int current = s.charAt(i);

            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                int previous = stack.peek().charValue();
                if(current == previous) {
                    stack.pop();
                    continue;
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        if(stack.isEmpty()) {
            return str;
        }

        while(!stack.isEmpty()) {
            str = stack.pop() + str;
        }

        return str;
    }

    public static void main(String[] args) {
        String s1 = "aa";
        System.out.println(superReducedString(s1));

    }
}
