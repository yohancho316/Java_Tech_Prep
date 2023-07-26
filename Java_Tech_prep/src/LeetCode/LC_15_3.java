package LeetCode;

import java.util.*;

public class LC_15_3 {

    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return null;
        List<List<Integer>> list = new ArrayList<>();
        Set<String> set = new HashSet<String>();
        Arrays.sort(nums);

        for(int i = 0; i <= nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if(i == 0 || nums[i] != nums[i - 1]) {
                while(left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum > 0) {
                        --right;
                    } else if(sum < 0) {
                        ++left;
                    } else {
                        // Check if we already encountered this
                        if(!(set.contains("" + nums[i] + nums[left] + nums[right]))) {
                            list.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                            set.add("" + nums[i] + nums[left] + nums[right]);
                        }
                        ++left; --right;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,-1,0};
        threeSum(nums);
    }
}
