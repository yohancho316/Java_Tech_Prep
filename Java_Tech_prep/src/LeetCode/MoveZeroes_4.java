package LeetCode;

import java.util.Arrays;

public class MoveZeroes_4 {

    public static void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int left = 0;
        int right = 0;

        while(right < nums.length) {
            if(nums[right] != 0) {
                nums[left++] = nums[right];
            }
            ++right;
        }

        while(left < nums.length) {
            nums[left] = 0;
            ++left;
        }

        return;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
