package LeetCode;

public class MoveZeroes_7 {

    public static void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int left = 0;
        int right = 0;

        while(right < nums.length) {
            if(nums[right] == 0) ++right;
            else {
                nums[left] = nums[right];
                ++left;
                ++right;
            }
        }

        while(left < nums.length) {
            nums[left] = 0;
            ++left;
        }
    }

    public static void main(String[] args) {

    }
}
