package LeetCode;

import java.util.HashMap;

public class MajorityElement_1 {

    public static int majorityElement(int[] nums) {

        if(nums.length == 1) return nums[0];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if(map.get(nums[i]) > (nums.length / 2)) {
                    return nums[i];
                }
            } else {
                map.put(nums[i], 1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(majorityElement(nums));
    }
}
