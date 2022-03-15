package LeetCode;

public class MaximumSubarray_3 {

    public static int maxSubArray(int[] nums) {

        // Case # 0: All integer elements are positive
        // Case # 1: All integer elements are negative
        // Case # 2: All integer elements are positive & negative

        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(Integer x:nums) {
            current_sum += x;
            if(current_sum > max_sum) {
                max_sum = current_sum;
            }
            if(current_sum < 0) {
                current_sum = 0;
            }
        }
        return max_sum;
    }


    public static void main(String[] args) {

    }
}
