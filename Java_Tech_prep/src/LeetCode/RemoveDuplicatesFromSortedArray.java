/*
URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */


package LeetCode;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // Local Declarations
        int length = 1, current = 0, compare = 1;

        // Check if Length of Nums == 0
        if(nums.length == 0) return 0;

        // Iterate through the Integer Array Nums
        while(compare < nums.length) {
            if(nums[current] == nums[compare]) {
                ++compare;
            } else {
                nums[current + 1] = nums[compare];
                ++length; ++current; ++compare;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(removeDuplicates(nums));
    }
}
