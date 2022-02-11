/*
URL: https://leetcode.com/problems/two-sum/
Difficulty: Easy
Time Complexity: O(N) where N is the size of the integer array nums
Space Complexity: O(N) worst case being that all elements in nums is unique.
 */

package LeetCode;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_2 {

    public static int[] twoSum(int[] nums, int target) {

        // Local Declarations
        int[] return_arr = new int[2];
        Map<Integer, Integer> my_map = new HashMap<>();

        // Insert Nums Elements into Hash Map
        for(int i = 0; i < nums.length; i++) {
            my_map.put(nums[i], i);
        }

        //
        for(int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            if((my_map.containsKey(diff)) && (my_map.get(diff) != j)) {
                return_arr[0] = j;
                return_arr[1] = my_map.get(diff);
                return return_arr;
            }
        }

        return return_arr;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
