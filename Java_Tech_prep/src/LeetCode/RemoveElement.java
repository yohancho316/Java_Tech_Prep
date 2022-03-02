package LeetCode;
import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        // Local Declarations
        int slow = 0, fast = 0, swaps = 0;

        while(fast < nums.length) {

            if(nums[fast] != val) {
                nums[slow] = nums[fast];
                ++swaps;
                ++slow;
            }

            ++fast;
        }

        System.out.println(Arrays.toString(nums));
        return swaps;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4};
        System.out.println(removeElement(nums, 4));
    }
}
