package LeetCode;

public class RunningSumOf1DArray_2 {

    public int[] runningSum(int[] nums) {
        if(nums.length == 1) return nums;

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {

    }
}
