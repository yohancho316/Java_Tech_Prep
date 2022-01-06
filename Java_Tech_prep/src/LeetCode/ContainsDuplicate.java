/*
URL: https://leetcode.com/problems/contains-duplicate/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(N)
 */

package LeetCode;
import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        // Local Declarations
        HashMap<Integer,Boolean> my_map = new HashMap<>();

        // Iterate through Nums
        for(int i = 0; i < nums.length; i++) {
            if(my_map.containsKey(nums[i])) {
                return true;
            } else {
                my_map.put(nums[i], true);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,1,1};
        System.out.println(containsDuplicate(nums));
    }
}
