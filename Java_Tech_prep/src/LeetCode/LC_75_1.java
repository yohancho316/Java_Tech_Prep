package LeetCode;

import java.util.Arrays;

public class LC_75_1 {

    public static void sortColors(int[] nums) {
        if(nums.length == 1) return;
        int left = 0;
        int current = 0;
        int right = nums.length - 1;
        int temp;

        while(current <= right) {
            if(nums[current] == 0) {
                temp = nums[left];
                nums[left] = nums[current];
                nums[current] = temp;
                ++left; ++current;
            } else if(nums[current] == 2){
                temp = nums[right];
                nums[right] = nums[current];
                nums[current] = temp;
                --right;
            } else {
                ++current;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println("Before: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("After: " + Arrays.toString(nums));
    }
}
