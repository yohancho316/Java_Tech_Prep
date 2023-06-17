package LeetCode;

import java.util.*;

public class LC_15_1 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int fixed = 0; fixed < nums.length - 2; ++fixed) {
            int left = fixed + 1;
            int right = nums.length - 1;
            int diff = 0 - nums[fixed];
            while(left < right) {
                if((nums[left] + nums[right]) == diff) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[fixed]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    ++left;
                } else if(nums[left] + nums[right] > diff) {
                    --right;
                } else {
                    ++left;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);

        list2.add(2);
        list2.add(2);

        Set<List<Integer>> set = new HashSet<>();
        set.add(list1);
        set.add(list2);
        System.out.println("Set Size: " + set.size());
    }
}
