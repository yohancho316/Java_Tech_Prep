package LeetCode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII_1 {

    public static int removeDuplicates(int[] nums) {

        int slow = 0;
        int fast = 0;
        int occurs = 0;

        while(fast < nums.length) {
            if(nums[slow] == nums[fast]) {
                if(occurs <= 1) {
                    ++occurs;
                }
                ++fast;
            } else {
                slow += occurs;
                occurs = 1;
                nums[slow] = nums[fast];
                ++fast;
            }
        }

        if(occurs == 2) nums[++slow] = nums[fast - 1];

        for(int i = slow + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,3};
        removeDuplicates(nums);
    }
}
