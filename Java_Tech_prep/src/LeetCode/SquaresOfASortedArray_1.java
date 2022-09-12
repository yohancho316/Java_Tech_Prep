package LeetCode;
import java.util.Arrays;

public class SquaresOfASortedArray_1 {

    public static int[] sortedSquares(int[] nums) {
        int[] return_arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;

        while(left <= right) {
            if(Math.pow(Math.abs(nums[left]),2) > Math.pow(Math.abs(nums[right]),2) ) {
                return_arr[pos] = (int) Math.pow(Math.abs(nums[left]),2);
                --pos;
                ++left;
            } else {
                return_arr[pos] = (int) Math.pow(Math.abs(nums[right]),2);
                --pos;
                --right;
            }
        }
        return return_arr;
    }


    public static void main(String[] args) {
        int[] nums = {-10, -5, -3, 1, 2, 6};

        System.out.println("Pre Squared: " + Arrays.toString(nums));
        nums = sortedSquares(nums);
        System.out.println("Post Squared: " + Arrays.toString(nums));
    }
}
