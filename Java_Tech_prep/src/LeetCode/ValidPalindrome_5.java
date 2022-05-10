package LeetCode;

public class ValidPalindrome_5 {

    public static boolean isPalindrome(String s) {

        s = s.trim();

        if(s.isEmpty() || s.length() == 1) return true;

        int left = 0;
        int right = s.length() - 1;

        while(left <= right) {
            char left_char = s.charAt(left);
            char right_char = s.charAt(right);

            if(!Character.isLetterOrDigit(left_char)) {
                ++left;
                continue;
            }

            if(!Character.isLetterOrDigit(right_char)) {
                --right;
                continue;
            }

            if(!(Character.toLowerCase(left_char) == Character.toLowerCase(right_char))) {
                return false;
            } else {
                ++left;
                --right;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = " ";
        System.out.println(Character.isWhitespace(s.charAt(0)));
        System.out.println(isPalindrome(s));
    }
}
