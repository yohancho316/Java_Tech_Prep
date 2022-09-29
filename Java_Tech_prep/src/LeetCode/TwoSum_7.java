package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_7 {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if((map.containsKey(diff)) && (map.get(diff) != i)) {
                arr[0] = i;
                arr[1] = map.get(diff);
                return arr;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
