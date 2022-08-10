package LeetCode;

import java.util.Stack;

public class BaseballGame_1 {

    public static int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;

        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("C")) {
                stack.pop();
            } else if(ops[i].equals("D")) {
                stack.push(stack.peek() * 2);
            } else if(ops[i].equals("+")) {
                int x = stack.pop();
                int y = stack.peek();
                stack.push(x);
                stack.push(x + y);
            } else {
                stack.push(Integer.parseInt(ops[i]));
            }
        }

        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {

        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
}
