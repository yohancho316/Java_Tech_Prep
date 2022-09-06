package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindrome_1 {

    public static int longestPalindrome(String s) {
        if(s.length() == 1) return 1;

        int maxLength = 0;
        HashSet<Character> set = new HashSet<Character>();


        for(int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                set.remove(s.charAt(i));
                maxLength += 2;
            }
        }

        if(!set.isEmpty()) {
            ++maxLength;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(s + " is a Palindrome w/ Max Length: " + longestPalindrome(s));
    }
}
