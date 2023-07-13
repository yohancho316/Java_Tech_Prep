package LeetCode;

import java.util.Arrays;

public class LC_31_1 {

    public static void nextPermutation(int[] nums) {
        if(nums.length == 1) return;

        int pos = nums.length - 2;

        // Stop at index position where nums[pos] < nums[pos] + 1
        // This index position is the first position where a smaller element (nums[pos]) can be swapped to obtain the next permutation
        while(pos >= 0 && (nums[pos] > nums[pos + 1])) {
            --pos;
        }

        // This block attempts to find the element in the array that is just larger than the element at the "pos" index.
        // It searches for the smallest element that is greater than nums[pos] in the suffix of the array.
        if (pos >= 0) {
            int right = nums.length - 1;
            while (right > pos && nums[right] <= nums[pos]) {
                right--;
            }
            // By swapping the elements, we ensure that the next permutation is lexicographically greater than the previous permutation
            // but still the smallest possible among all permutations that are greater than the previous one
            swap(nums, pos, right);
        }

        // By reversing the elements in the suffix of the array starting from index "pos + 1". It ensures that the suffix is sorted
        // in ascending order, which is necessary to obtain the next lexicographically smallest permutation
        reverse(nums, pos + 1);
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }

    public static void reverse(int[] nums, int left) {
        int right = nums.length - 1;
        while(left < right) {
            swap(nums, left, right);
            ++left; --right;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println("Before: " + Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println("After: " + Arrays.toString(nums));
    }
}
