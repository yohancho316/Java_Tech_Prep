/*
URL: https://leetcode.com/problems/maximum-subarray/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Algorithm: 1. Declare an integer variable current_sum & max_sum. Initialize current_sum to 0
              & max_sum to nums[0].
           2. Check if the length of nums is 1. If true return the value at the 0-th index of nums
           3. Check if the current element > max_sum (resolves all negative array elements)
           4. Add the current element to the current_sum.
           5. Check if current_sum < 0, if true then reassign current_sum's value to 0.
           6. Else if current_sum > 0 && current_sum > max_sum, reassign max_sum's value with
              current_sum's value.
           7. Return max_sum.
 */

package LeetCode;

public class Maximum_Subarray {

    public static int maxSubArray(int[] nums) {

        // Local Declarations
        int current_sum = 0;
        int max_sum = nums[0];

        // Check if Length of Nums is 1
        if(nums.length == 1) {
            return nums[0];
        }

        // Iterate through Elements of Nums and Add to Current Sum
        for(int i = 0; i < nums.length; i++) {

            // Calculate Current Sum
            current_sum += nums[i];

            // Check if Current Element is Larger than Max Sum
            if(nums[i] > max_sum) {
                max_sum = nums[i];
            }

            // Check if Current Sum is Negative
            if(current_sum < 0) {
                current_sum = 0;
                continue;
            } else if(current_sum > max_sum) {
                max_sum = current_sum;
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-10,-20,-15,-15,-30,-1};
        System.out.println(maxSubArray(nums));
    }
}
