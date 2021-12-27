/*
URL: https://leetcode.com/problems/longest-common-prefix/
Difficulty: Easy
Time Complexity: O(N) where N is the sum of all characters in the String Array
Space Complexity: O(1)
 */


package LeetCode;

public class LongestCommonPrefix {

    // Solve Using Horizontal Comparison (By Row)
    public static String longestCommonPrefix_horizontal(String[] strs) {

        // Local Variables
        String prefix = strs[0];

        // Check if String Array is Empty
        if(strs.length == 0 || strs == null) {
            return "";
        }

        // Implement Horizontal Scanning to Find Prefix
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    // Solve Using Vertical Comparison (By Column)
    public static String longestCommonPrefix_vertical(String[] strs) {

        // Check if String Array is Empty
        if(strs.length == 0 || strs == null) {
            return "";
        }

        // Compare Characters of First Word by Column
        for(int i = 0; i < strs[0].length(); i++) {
            char compare = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != compare) {
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        String[] string_arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix_vertical(string_arr));
    }
}
