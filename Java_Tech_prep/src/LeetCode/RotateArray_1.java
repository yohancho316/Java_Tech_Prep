package LeetCode;

import java.util.Arrays;

public class RotateArray_1 {

    public static void rotate(int[] nums, int k) {

        if(k % nums.length == 0) {
            return;
        }

        k = k - (nums.length * (k / nums.length));
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }

        left = 0;
        right = k - 1;

        while(left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }

        left = k;
        right = nums.length - 1;

        while(left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }

        return;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("Original: " + Arrays.toString(nums));
        rotate(nums, 4);



    }
}
