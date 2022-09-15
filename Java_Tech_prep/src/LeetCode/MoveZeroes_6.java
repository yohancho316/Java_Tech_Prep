package LeetCode;

import java.util.Arrays;

public class MoveZeroes_6 {

    public static void moveZeroes(int[] nums) {
        if(nums.length == 1) return;

        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                continue;
            } else if(left == right) {
                ++left;
            } else {
                nums[left] = nums[right];
                ++left;
            }
        }

        while(left < nums.length) {
            nums[left] = 0;
            ++left;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,4,5};
        System.out.println("Before Move: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("After Move: " + Arrays.toString(nums));
    }
}
