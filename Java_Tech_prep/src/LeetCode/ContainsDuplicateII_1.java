package LeetCode;

import java.util.HashMap;
import java.util.List;

public class ContainsDuplicateII_1 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if(k == 0 || nums.length == 1) return false;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int h = 0; h < nums.length; h++) {
            map.put(nums[h],map.getOrDefault(nums[h],0) + 1);
        }

        if(map.size() == nums.length) return false;

        for(int i = 0; i < nums.length - 1; i++) {
            if(map.get(nums[i]) == 1) continue;
            for(int j = i + 1; j < nums.length; j++) {
                if((nums[i] == nums[j]) && (Math.abs(i - j) > k)) break;
                if((nums[i] == nums[j]) && (Math.abs(i - j) <= k)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums, 3));



    }
}
