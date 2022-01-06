/*
URL: https://leetcode.com/problems/maximum-subarray/submissions/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */

package LeetCode;

public class Maximum_Subarray_2 {

    public static int maxSubArray(int[] nums) {

        // Local Declarations
        int max_sum = nums[0];
        int current_sum = 0;

        // Iterate through Elements in nums
        for(int i = 0; i < nums.length; i++) {
            current_sum += nums[i];
            if(current_sum > max_sum) {
                max_sum = current_sum;
            }
            if(current_sum < 0) {
                current_sum = 0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {-10,1,2,-20,5,-50};
        System.out.println(maxSubArray(arr));
    }
}
