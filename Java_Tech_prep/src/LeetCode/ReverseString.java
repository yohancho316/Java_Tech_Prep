/*
URL: https://leetcode.com/problems/reverse-string/
Difficulty: Easy
Time Complexity: O(N) to Swap N/2 Elements
Space Complexity: O(1)
 */

package LeetCode;
import java.util.Arrays;

public class ReverseString {


    public static char[] reverseString(char[] s) {

        // Local Declarations
        int front = 0;
        int end = s.length - 1;

        // Iterate Through Char Array
        for(int i = 0; i < (s.length / 2); i++) {
            char temp = s[end];
            s[end] = s[front];
            s[front] = temp;
            ++front;
            --end;
        }

        // Return the Char Array
        return s;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b'};
        System.out.println(Arrays.toString(reverseString(arr)));
    }
}
