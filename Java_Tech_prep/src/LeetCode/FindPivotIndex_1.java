package LeetCode;

public class FindPivotIndex_1 {

    public static int pivotIndex(int[] nums) {
        if(nums.length == 1) return -1;

        int total = 0;
        int lSum = 0;

        for(int i = 0; i < nums.length ; i++) {
            total += nums[i];
        }

        for(int j = 0; j < nums.length; j++) {
            if(lSum == (total - lSum - nums[j])) return j;
            else lSum += nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
