package LeetCode;

public class MaximumDifferenceBetweenIncreasingElements_1 {

    public int maximumDifference(int[] nums) {

        int max_diff = -1;
        int smallest = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] > smallest) {
                max_diff = Integer.max(max_diff, (nums[i] - smallest));
            }

            smallest = Integer.min(smallest, nums[i]);
        }

        return max_diff;
    }

    public static void main(String[] args) {

    }
}
