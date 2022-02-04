/*
URL: https://leetcode.com/problems/valid-palindrome/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */

package LeetCode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        // Local Declarations
        String str = "";

        // Iterate through s & Append only Alphanumeric Characters
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if((current >= 'a' && current <= 'z') || (current >= 'A' && current <= 'Z') || (current >= '0' && current <= '9')) {
                str += current;
            }
        }

        // Cast all Uppercase Letters to Lowercase
        str = str.toLowerCase();

        // Use Two Pointer Technique to Check for Palindrome
        int start = 0;
        int end = str.length() - 1;
        int halfway = str.length() / 2;

        for(int i = 0; i < halfway; ++i, ++start, --end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
        }

        // Return True as Str is a Valid Palindrome
        return true;
    }


    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}
