package LeetCode;

public class FindTheMiddleIndexInTheArray_1 {

    public static int findMiddleIndex(int[] nums) {
        int total = 0;
        int left = 0;

        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        for(int j = 0; j < nums.length; j++) {
            if(left == (total - left - nums[j])) {
                return j;
            } else {
                left += nums[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
}
