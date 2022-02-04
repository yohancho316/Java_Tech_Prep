/*
URL:
Difficulty:
Time Complexity:
Space Complexity:
 */


package LeetCode;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        // Local Declarations
        int max = nums[0];
        int current = 0;

        for(int i = 0; i < nums.length; i++) {
            current += nums[i];

            if(current > max) max = current;

            if(current < 0) current = 0;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-10};
        System.out.println("Max: " + maxSubArray(nums));
    }
}
