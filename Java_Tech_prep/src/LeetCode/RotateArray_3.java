package LeetCode;

import java.util.Arrays;

public class RotateArray_3 {

    public static void rotate(int[] nums, int k) {
        if(k % nums.length == 0) return;

        for(int i = 0; i < k; i++) {
            int[] arr = new int[nums.length];
            int temp = nums[nums.length - 1];
            for(int j = 1; j < nums.length; j++) {
                arr[j] = nums[j -1];
            }
            arr[0] = temp;
            nums = arr;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
}
