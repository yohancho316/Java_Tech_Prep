package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_8 {

    public static int[] twoSum(int[] nums, int target) {
        if(nums.length <= 2) return new int[] {0,1};

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++) {
            if((map.containsKey(target - nums[j])) && (map.get(target - nums[j]) != j)) {
                return new int[]{nums[j], nums[map.get(target - nums[j])]};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
