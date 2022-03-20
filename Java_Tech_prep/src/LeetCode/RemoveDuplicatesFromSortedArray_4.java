package LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_4 {

    public static int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        for(;fast < nums.length; fast++) {
            if(nums[slow] != nums[fast]) {
                nums[slow + 1] = nums[fast];
                ++slow;
            }
        }
        return slow + 1;
    }


    public static void main(String[] args) {

        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
}
