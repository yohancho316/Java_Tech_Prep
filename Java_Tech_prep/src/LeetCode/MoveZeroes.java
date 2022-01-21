/*
URL: https://leetcode.com/problems/move-zeroes/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */

package LeetCode;
import java.util.Arrays;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {

        // Local Declarations
        int left = 0;
        int right = 1;

        // Check if Nums Length == 1
        if(nums.length == 1) return nums;

        // Iterate through the Integer Array Nums
        while(right < nums.length) {

            if(nums[left] != 0 && nums[right] != 0) {
                ++left;
                ++right;
            } else if((nums[left] == 0) && (nums[right] != 0)) {
                int temp = nums[right];
                nums[right] = 0;
                nums[left] = temp;
                ++left;
                ++right;
            } else if((nums[left] != 0) && (nums[right] == 0)) {
                ++left;
                ++right;
            } else if(nums[left] == 0 && nums[right] == 0) {
                ++right;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
}
