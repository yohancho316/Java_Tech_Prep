package LeetCode;

public class MaximumAverageSubarray_2 {

    public static double findMaxAverage(int[] nums, int k) {
        double currentSum = 0.0;

        for(int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;

        for(int j = k; j < nums.length; j++) {
            currentSum -= nums[j -k];
            currentSum += nums[j];
            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum / k;
    }


    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int[] nums2 = {-1};
        System.out.println(findMaxAverage(nums2, 1));
    }
}
