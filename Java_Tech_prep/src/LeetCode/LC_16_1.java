package LeetCode;

import java.util.Arrays;

public class LC_16_1 {

    public static int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3) return (nums[0] + nums[1] + nums[2]);
        int pos = 0; int min = Integer.MAX_VALUE; Arrays.sort(nums); int closest = 0;

        while(pos <= (nums.length - 3)) {
            int left = pos + 1; int right = nums.length - 1;
            while(left < right) {
                int sum = nums[pos] + nums[left] + nums[right];

                if(sum == target) return sum;
                else if(sum > target) --right;
                else ++left;
                int difference = Math.abs(target - sum);
                if(difference < min) {
                    min = difference;
                    closest = sum;
                }
            }
            ++pos;
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0};
        System.out.println("Min: " + threeSumClosest(nums, -100));
    }
}
