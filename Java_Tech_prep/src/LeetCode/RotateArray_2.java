package LeetCode;

import java.util.Arrays;

public class RotateArray_2 {

    public static void rotate(int[] nums, int k) {

        if(nums.length == 1) return;

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }

        left = 0;
        right = k - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }

        left = k;
        right = nums.length - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        rotate(nums, 3);

    }
}
