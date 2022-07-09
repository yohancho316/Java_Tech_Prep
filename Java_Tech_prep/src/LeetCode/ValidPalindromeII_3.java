package LeetCode;

public class ValidPalindromeII_3 {

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

    public static boolean validPalindrome(String s) {
        if(s.length() == 1) return true;
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                ++left;
                --right;
            } else {
                boolean skip_left = checkPalindrome(s, left + 1, right);
                boolean skip_right = checkPalindrome(s, left, right - 1);

                if (skip_left || skip_right) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(validPalindrome(s));
    }
}
