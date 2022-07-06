package LeetCode;

public class ValidPalindrome_7 {

    public static boolean isPalindrome(String s) {

        if(s.equals(" ")) return true;

        int left = 0;
        int right = s.length() - 1;

        while(left <= right) {
            char left_char = s.charAt(left);
            char right_char = s.charAt(right);


            if(Character.isWhitespace(left_char) || !Character.isLetterOrDigit(left_char)) {
                ++left;
                continue;
            }

            if(Character.isWhitespace(right_char) || !Character.isLetterOrDigit(right_char)) {
                --right;
                continue;
            }

            if(Character.compare(Character.toLowerCase(left_char),Character.toLowerCase(right_char)) == 0) {
                ++left;
                --right;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
