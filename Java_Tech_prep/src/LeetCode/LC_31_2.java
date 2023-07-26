package LeetCode;

import java.util.Arrays;

public class LC_31_2 {

    public static void nextPermutation(int[] nums) {
        if(nums.length < 2) return;
        int pivot = nums.length - 2;

        // Find the Pivot Index Position
        while(pivot >= 0) {
            if(nums[pivot] < nums[pivot + 1]) break;
            else --pivot;
        }

        if(pivot >= 0) {
            // Find the Swap Index Position
            for(int i = nums.length - 1; i > pivot; --i) {
                if(nums[i] > nums[pivot] ) {
                    swapElements(nums, pivot, i);
                    break;
                }
            }
        }
        flipElements(nums, pivot + 1, nums.length - 1);
    }

    public static void swapElements(int[] nums, int pivot, int swap) {
        // Swap the Index Positions for Pivot & Swap
        int temp = nums[pivot];
        nums[pivot] = nums[swap];
        nums[swap] = temp;
    }

    public static void flipElements(int[] nums, int left, int right) {
        while(right > left) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,1,4,1};
        nextPermutation(nums);
    }
}
