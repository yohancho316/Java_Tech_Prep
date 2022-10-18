package LeetCode;

import java.util.Arrays;

public class RemoveElement_4 {

    public static int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            if(nums[left] != val) {
                ++left;
                continue;
            }

            if(nums[right] == val) {
                --right;
                continue;
            }

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,2,2,3};
        System.out.println(removeElement(nums, 0));
    }
}
