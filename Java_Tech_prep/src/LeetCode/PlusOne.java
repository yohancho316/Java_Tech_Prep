/*
URL: https://leetcode.com/problems/plus-one/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */


package LeetCode;
import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        // Local Declarations
        int n = digits.length;

        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
