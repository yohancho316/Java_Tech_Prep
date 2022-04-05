package LeetCode;

public class ValidPalindromeII_2 {

    public static boolean validPalindrome(String s) {

        if(s.length() == 1) return true;

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                ++left;
                --right;
            } else {
                boolean left_state = checkPalindrome(s, left + 1, right);
                boolean right_state = checkPalindrome(s, left, right - 1);

                if(left_state || right_state) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                ++left;
                --right;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "abcd";
        System.out.println("is abad a palindrome: " + validPalindrome(s));
    }
}
