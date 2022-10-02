package LeetCode;

import java.util.Arrays;

public class SquaresOfASortedArray_3 {

    public static int[] sortedSquares(int[] nums) {

        int[] arr = new int[nums.length];
        int pos = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            if(Math.abs(nums[right]) > Math.abs(nums[left])) {
                arr[pos] = (int) Math.pow(nums[right], 2);
                --right;
                --pos;
            } else {
                arr[pos] = (int) Math.pow(nums[left], 2);
                --pos;
                ++left;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-6,-3,0,2,4};
        sortedSquares(nums);
        // 0, 4, 9, 16, 36
    }
}
