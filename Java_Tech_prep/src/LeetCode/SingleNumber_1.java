package LeetCode;

import java.util.HashSet;

public class SingleNumber_1 {

    public static int singleNumber(int[] nums) {

        if(nums.length == 1) return nums[0];

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        int result = 0;
        for(Integer num : set) {
            result = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,-2};
        System.out.println(singleNumber(nums));

    }
}
