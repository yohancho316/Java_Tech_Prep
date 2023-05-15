package LeetCode;

import java.util.*;

public class ThreeSum_2 {

    public static List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3 || nums[0] >= 1) return new ArrayList<>();
        List<List<Integer>> triplet = new ArrayList<>(new ArrayList<>());
        Arrays.sort(nums);

        for(int i = 0; i <= nums.length - 3; i++) {

            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[i]);
            int left = i + 1;
            int right = nums.length - 1;
            int sum = nums[i];
            int count = 1;

            if(nums[i] >= 1) break;


            while(count < 3 && left < right) {
                if(sum >= 0) {
                    list.add(nums[left]);
                    sum += nums[left];
                    ++left;
                    ++count;
                } else {
                    list.add(nums[right]);
                    sum += nums[right];
                    --right;
                    ++count;
                }
            }

            if(count == 3 && sum == 0) triplet.add(list);
        }
        return triplet;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}
