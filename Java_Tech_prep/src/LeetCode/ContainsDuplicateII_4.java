package LeetCode;

import java.util.HashMap;

public class ContainsDuplicateII_4 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1) return false;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(map.containsKey(current)) {
                int difference = Math.abs(map.get(current) - i);
                if(difference <= k) return true;
                else map.put(current, i);
            } else {
                map.put(current, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,3};
        System.out.println(containsNearbyDuplicate(nums, 2));
    }
}
