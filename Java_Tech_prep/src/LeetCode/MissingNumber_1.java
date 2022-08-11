package LeetCode;

public class MissingNumber_1 {

    public static int missingNumber(int[] nums) {

        int total = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            total += i;
            sum += nums[i];
        }

        return ((total + nums.length) - sum);
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2};
        System.out.println(missingNumber(nums));
    }
}
