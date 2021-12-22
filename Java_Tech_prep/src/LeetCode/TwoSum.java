/*
URL: https://leetcode.com/problems/two-sum/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(N)
Algorithm: 1. Instantiate a HashMap Object called "my_map"
           2. Instantiate an integer array called "return_arr"
           3. Iterate through integer array "nums"
              Insert the value of each element in the array w/ its index value as a KVP
              in the HashMap Object "my_map"
           4. Iterate through integer array "nums" and find the difference value
           5. Check if the difference value exists as a key in the HashMap && that the index
              value associated at the given key isn't equal to the loop count.
           6. If the expression evaluates to true insert the value of the loop count and the
              index value associated at the given key in the 0th and 1st index of return_arr
           7. Return the array "return_arr"
           8. If loop executes without finding match function returns null.
 */

package LeetCode;
import java.util.*;

public class TwoSum {

//    public static int[] twoSum_brute_force(int[] nums, int target) {
//
//    }

    public static int[] twoSum_single_pass(int[] nums, int target) {

        // Local Declarations
        HashMap<Integer,Integer> my_map = new HashMap<Integer,Integer>();
        int[] return_arr = new int[2];

        // Insert Elements of Integer Array Nums in HashMap
        for(int i = 0; i < nums.length; i++) {
            my_map.put(nums[i],i);
        }

        // Check if Difference Value of Target - Nums[j] Exists in HashMap
        for(int j = 0; j < nums.length; j++) {
            int difference = target - nums[j];
            if(my_map.containsKey(difference) && my_map.get(difference) != j) {
                return_arr[0] = j;
                return_arr[1] = my_map.get(difference);
                return return_arr;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        int[] nums = {0,0};
        int target = 0;

        System.out.println(Arrays.toString(twoSum_single_pass(nums,target)));

    }
}
