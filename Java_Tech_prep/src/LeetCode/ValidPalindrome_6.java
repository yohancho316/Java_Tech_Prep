package LeetCode;

import javax.swing.text.html.StyleSheet;

public class ValidPalindrome_6 {

    public static boolean isPalindrome(String s) {

        // Trim the String s of Leading & Trailing White Spaces
        s = s.trim();

        // Check if the String is Empty
        if(s.isEmpty()) return true;

        // Declare two integer variables
        int left = 0;
        int right = s.length() - 1;

        // Iterate through while loop
        while(left <= right) {

            // Declare two local char type variables
            char left_char = Character.toLowerCase(s.charAt(left));
            char right_char = Character.toLowerCase(s.charAt(right));

            // Check if left_char is not an alphanumeric character
            if(!Character.isLetterOrDigit(left_char)) {
                ++left;
                continue;
            }

            // Check if right_char is not an alphanumeric character
            if(!Character.isLetterOrDigit(right_char)) {
                --right;
                continue;
            }

            // CHeck if left_char == right_char (comparing unicode values)
            if(!(left_char == right_char)) {
                return false;
            }

            // Increment Left && Decrement Right
            ++left;
            --right;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "   1 aba1   ";
        System.out.println(isPalindrome(s));
    }
}
