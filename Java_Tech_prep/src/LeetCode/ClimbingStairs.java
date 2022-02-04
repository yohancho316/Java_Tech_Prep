/*
URL: https://leetcode.com/problems/climbing-stairs/
Difficulty: Easy
Time Complexity:
Space Complexity:
 */

package LeetCode;

public class ClimbingStairs {

    public static int climbStairs(int n) {

        // Local Declarations
        int x = 0, y = 1;

        // Iterate from 1 to N
        for(int i = 1; i <= n; i++) {
            int temp_sum = x + y;
            x = y;
            y = temp_sum;
        }

        return y;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
