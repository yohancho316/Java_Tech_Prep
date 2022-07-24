package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate_3 {

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return false;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
