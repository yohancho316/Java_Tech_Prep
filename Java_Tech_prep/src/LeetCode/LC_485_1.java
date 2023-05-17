package LeetCode;

public class LC_485_1 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;

        while(right < nums.length) {

            if(nums[right] == 1) ++right;
            else {
                max = Integer.max(max, right - left);
                left = right + 1;
                ++right;
            }
        }
        max = Integer.max(max, right - left);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1};
        System.out.println("Max 1's: " + findMaxConsecutiveOnes(nums));
    }
}
