package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ValidPalindromeII_4 {

    public static boolean isPalindrome(String s) {
        for(int left = 0, right = s.length() - 1; left < right; ++left, --right) {
            if(s.charAt(left) != s.charAt(right)) return false;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        if(s.length() <= 2) return true;
        Set<String> set = new HashSet<String>();

        for(int i = 0; i < s.length(); i++) {
            String compare = "" + s.substring(0,i) + s.substring(i + 1);
            if(set.contains(compare)) continue;
            if(isPalindrome(compare)) return true;
            else set.add(compare);

        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abd";
        System.out.println(validPalindrome(s));
    }
}
