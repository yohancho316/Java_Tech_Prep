package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LC_217_1 {

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
