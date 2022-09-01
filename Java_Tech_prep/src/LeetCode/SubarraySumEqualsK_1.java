package LeetCode;

public class SubarraySumEqualsK_1 {

    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int left = 0;
        int right = 0;

        while(right < nums.length) {
            sum += nums[right];

            if(sum < k) {
                ++right;
            } else if(sum > k) {
                sum -= nums[left];
                ++left;
            } else {
                ++count;
                ++right;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
