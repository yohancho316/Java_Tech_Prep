package LeetCode;

import java.util.Arrays;

public class RunningSumOf1DArray_1 {

    public static int[] runningSum(int[] nums) {
        if(nums.length == 1) return nums;

        int[] nums2 = new int[nums.length];
        nums2[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            nums2[i] = nums[i] + nums2[i - 1];
        }

        return nums2;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
