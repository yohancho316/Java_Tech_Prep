package LeetCode;

public class LC_16_2 {

    public static int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3) return (nums[0] + nums[1] + nums[2]);
        int pos = 0; int minDistance = Integer.MAX_VALUE; int closestSum = 0;
        while(pos < (nums.length - 2)) {
            int left = pos + 1; int right = nums.length - 1;
            while(left < right) {
                int sum = nums[pos] +  nums[left] + nums[right];
                if(sum == target) return target;
                int difference = Math.abs(target - sum);
                if(sum > target) --right;
                else ++left;

                if(difference < minDistance) {
                    minDistance = difference;
                    closestSum = sum;
                }
            }
            ++pos;
        }
        return closestSum;
    }

    public static void main(String[] args) {

    }
}
