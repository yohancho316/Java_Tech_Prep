package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_6 {

    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference) != i) {
                sum[0] = i;
                sum[1] = map.get(difference);
                return sum;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(twoSum(nums, 5)));
    }
}
