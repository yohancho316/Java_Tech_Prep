package LeetCode;

import java.util.HashMap;

public class ContainsDuplicateII_3 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1 || k == 0) return false;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
         for(int i = 0; i < nums.length; i++) {
             int current = nums[i];
             if(!map.containsKey(current)) {
                 map.put(current, i);
             } else if((map.containsKey(current)) && (i != map.get(current) && (current == nums[map.get(current)]) && (Math.abs(i - map.get(current)) <= k))) {
                 //if((i != map.get(current) && (current == nums[map.get(current)]) && (Math.abs(i - map.get(current)) <= k))) {
                     return true;
                 } else {
                     map.put(current, i);
                 }
             }
         return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}
