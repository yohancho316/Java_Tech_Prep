package LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_7 {

    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;

        while(fast < nums.length) {
            if(nums[slow] == nums[fast]) ++fast;
            else {
                nums[++slow] = nums[fast];
                ++fast;
            }
        }

        ++slow;

        for(int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
