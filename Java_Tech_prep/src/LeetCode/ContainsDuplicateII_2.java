package LeetCode;

import java.util.HashMap;

public class ContainsDuplicateII_2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1 || k == 0) return false;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a = 0; a < nums.length; a++) {
            map.put(nums[a], map.getOrDefault(nums[a],0) + 1);
        }

        for(int i = 0; i < nums.length - 1; i++) {
            if(map.get(nums[i]) == 1) continue;
            for(int j = i + 1; j < nums.length; j++) {
                if((i != j) && (nums[i] == nums[j]) && (Math.abs(i - j) <= k)) return true;
                else if((i != j) && (nums[i] == nums[j]) && (Math.abs(i - j) > k)) break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}
