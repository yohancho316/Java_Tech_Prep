package LeetCode;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        // Local Declarations
        int max_count = 0;
        int current_count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                ++current_count;
            } else {
                current_count = 0;
            }

            if(current_count > max_count) max_count = current_count;
        }

        return max_count;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
