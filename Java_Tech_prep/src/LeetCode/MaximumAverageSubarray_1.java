package LeetCode;

public class MaximumAverageSubarray_1 {

    public static double findMaxAverage(int[] nums, int k) {

        double currentSum = 0;

        for(int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxAverage = currentSum;

        for(int j = k; j < nums.length; j++) {
            currentSum -= nums[j - k];
            currentSum += nums[j];
            maxAverage = Math.max(maxAverage, currentSum);
        }

        return maxAverage / k;
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(findMaxAverage(nums, 1));
    }
}
