package LeetCode;

import java.util.Arrays;

public class LC_167_1 {

    public static int[] twoSum(int[] numbers, int target) {
        int[] nums = new int[2];
        int left = 0; int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                nums[0] = left + 1;
                nums[1] = right + 1;
                return nums;
            } else if(sum < target) {
                ++left;
            } else {
              --right;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {-3,-2,-1,0,1,2,3};
        System.out.println(Arrays.toString(twoSum(numbers, -1)));
    }
}
