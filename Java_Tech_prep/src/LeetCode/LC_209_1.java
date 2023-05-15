package LeetCode;

public class LC_209_1 {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min_size = Integer.MAX_VALUE;

        while(right < nums.length) {
            sum += nums[right];
            while((sum >= target) && (left <= right)) {
                if((right - left) + 1 < min_size) {
                    min_size = (right - left) + 1;
                }
                sum -= nums[left++];
            }
            ++right;
        }
        if(min_size > nums.length) return 0;
        return min_size;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println("Min Size: " + minSubArrayLen(7, nums));
    }
}
