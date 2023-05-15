package LeetCode;

import java.util.Arrays;

public class MoveZeroes_8 {
    public static void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int left = 0;
        int right = 0;
        while(right < nums.length) {
            if((left == right) && (nums[right] != 0)) {
                ++left; ++right;
            } else if(nums[right] != 0) {
                nums[left] = nums[right];
                ++left; ++right;
            } else ++right;
        }

        for(; left < nums.length; ++left) {
            nums[left] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("Before: " + Arrays.toString(nums));

        moveZeroes(nums);
        System.out.println("After: " + Arrays.toString(nums));
    }
}
