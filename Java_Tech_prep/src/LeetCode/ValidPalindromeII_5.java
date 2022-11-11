package LeetCode;

public class ValidPalindromeII_5 {

    public static boolean checkPalindrome(String s, int left, int right) {
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            ++left; --right;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        if(s.length() <= 2) return true;
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                ++left; --right;
            } else {
                return checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Is Palindrome: " + validPalindrome(s));
    }
}
