package LeetCode;

import java.util.*;

public class LC_15_2 {

    public static List<List<Integer>> threeSum(int[] nums) {
        // Sort the Given Input Array O(Log N)
        Arrays.sort(nums);

        // Instantiate the ArrayList Collection
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        // Iterate through each element in nums
        for(int i = 0; i <= nums.length - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                findTriplets(nums,list,i);
            }
        }
        return list;
    }

    public static void findTriplets(int[] nums, List<List<Integer>> list, int fixed) {
        int left = fixed + 1;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[fixed] + nums[left] + nums[right];
            if(sum == 0) {
                list.add(new ArrayList<>(Arrays.asList(nums[fixed],nums[left],nums[right])));
                ++left;
                while((left < right) &&nums[fixed] == nums[left]) ++left;
            } else if(sum > 0) {
                --right;
            } else {
                ++left;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println("Size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
