package LeetCode;
import java.util.Arrays;

public class MoveZeroes_2 {

    public static int[] moveZeroes(int[] nums) {

        // Local Declarations
        int left = 0, right = 1;

        while(right < nums.length) {

            if(nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                ++left;
                ++right;
            } else if(nums[left] == 0 && nums[right] == 0) {
                ++right;
            } else {
                ++left;
                ++right;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {0,0,0,0,0,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));

    }
}
