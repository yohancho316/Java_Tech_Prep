package LeetCode;

import java.util.Stack;

public class LC_394_1 {

    public static String decodeString(String s) {
        String tempStr = "";
        String digitStr = "";
        String returnStr = "";
        Stack<Character> stack = new Stack<Character>();
        boolean letterFlag = true;
        boolean digitFlag = false;

        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) stack.push(s.charAt(i));
        }

        while(!stack.isEmpty()) {

            while(Character.isLetter(stack.peek()) && letterFlag) {
                tempStr += "" + stack.pop() + tempStr;
                if(Character.isDigit(stack.peek())) {
                    letterFlag = false;
                    digitFlag = true;
                }
            }

            while(Character.isDigit(stack.peek()) && digitFlag) {
                digitStr += "" + stack.pop() + digitStr;
                if(Character.isLetter(stack.peek())) {
                    letterFlag = true;
                    digitFlag = false;
                }
            }

            letterFlag = true;
            digitFlag = false;

            for(int j = Integer.parseInt(digitStr); j > 0; j--) {
                tempStr += tempStr;
            }

            returnStr += tempStr;
            tempStr = "";
            digitStr = "";

        }

        for(int j = Integer.parseInt(digitStr); j > 0; j--) {
            tempStr += tempStr;
        }

        return returnStr += tempStr;
    }

    public static void main(String[] args) {

    }
}
