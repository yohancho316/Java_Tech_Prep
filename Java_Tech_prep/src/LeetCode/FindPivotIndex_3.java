package LeetCode;

public class FindPivotIndex_3 {

    public static int pivotIndex(int[] nums) {

        int total = 0;
        int left_sum = 0;

        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        for(int j = 0; j < nums.length; j++) {
            int right_sum = total - left_sum - nums[j];
            if(left_sum == right_sum) {
                return j;
            } else {
                left_sum += nums[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3};
        System.out.println(pivotIndex(nums));
    }
}
