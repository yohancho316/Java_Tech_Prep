package LeetCode;

import java.util.Arrays;

public class ShuffleTheArray_1 {

    public static int[] shuffle(int[] nums, int n) {

        int left = 0;
        int right = nums.length / 2;
        int mid = nums.length / 2;
        int pos = 0;

        int[] arr = new int[n * 2];

        for(; left < mid; ++left, ++right) {
            arr[pos++] = nums[left];
            arr[pos++] = nums[right];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Before: " + Arrays.toString(arr));
        System.out.println("After: " + Arrays.toString(shuffle(arr, 3)));

    }
}
