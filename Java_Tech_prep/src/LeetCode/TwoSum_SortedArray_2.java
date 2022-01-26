/*
URL: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */

package LeetCode;
import java.util.Arrays;

public class TwoSum_SortedArray_2 {

    public static int[] twoSum(int[] numbers, int target) {

        // Local Declarations
        int start = 0, end = numbers.length - 1;
        int[] return_arr = new int[2];

        // Iterate through the Integer Array Numbers
        while(start < end) {
            int sum = numbers[start] + numbers[end];

            if(sum == target) {
                return_arr[0] = start + 1;
                return_arr[1] = end + 1;
                break;
            }

            if(sum > target) {
                --end;
            } else {
                ++start;
            }
        }

        return return_arr;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
