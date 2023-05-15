package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Link: https://leetcode.com/problems/two-sum/
public class LC_1_1 {

    public static int[] twoSum(int[] nums, int target) {
        if(nums.length <= 2) return new int[] {0,1};
        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if((map.containsKey(difference)) && (map.get(difference) != i)) {
                arr[0] = i;
                arr[1] = map.get(difference);
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1};
        int[] nums2 = {-2,-2,-2};
        System.out.println(Arrays.toString(twoSum(nums2, -4)));
    }
}
