package LeetCode;

import sun.jvm.hotspot.opto.PhaseCFG;

import java.util.HashMap;

public class DegreeOfAnArray_1 {

    public static int findShortestSubArray(int[] nums) {
        if(nums.length == 1) return 1;

        HashMap<Integer,Integer> Left = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> Count = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> Right = new HashMap<Integer,Integer>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(!Left.containsKey(nums[i])) {
                Left.put(nums[i], i);
            } else {
                Right.put(nums[i], i);
            }
            Count.put(nums[i], Count.getOrDefault(nums[i], 0) + 1);
            max = (Count.get(nums[i]) > max) ? Count.get(nums[i]) : max;
        }

        if(max == 1) return 1;

        for(Integer key: Count.keySet()) {
            if(Count.get(key) == max) {
                min = Math.min(Right.get(key) - Left.get(key) + 1, min);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(findShortestSubArray(nums));
    }
}
