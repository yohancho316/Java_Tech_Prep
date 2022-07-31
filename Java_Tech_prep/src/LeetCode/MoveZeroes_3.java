package LeetCode;
import java.util.Arrays;

public class MoveZeroes_3 {

    public static void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        if(nums.length == 1) return;

        while(fast < nums.length) {
            if(nums[fast] == 0) {
                ++fast;
            } else if(nums[fast] != 0 && fast == slow) {
                ++fast; ++slow;
            } else {
                nums[slow] = nums[fast];
                nums[fast] = 0;
                ++slow; ++fast;
            }
        }

        System.out.println(Arrays.toString(nums));
        return;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,3,0,0,0,5};
        moveZeroes(nums);
    }
}
