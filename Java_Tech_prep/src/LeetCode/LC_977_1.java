package LeetCode;

public class LC_977_1 {

    public static int[] sortedSquares(int[] nums) {
        if(nums.length == 1) {
            nums[0] = (int) Math.pow(nums[0], 2);
            return nums;
        }

        int[] arr = new int[nums.length];
        int left = 0; int right = nums.length - 1; int pos = nums.length - 1;
        while(left <= right) {
            if(Math.pow(nums[left], 2) >= (Math.pow(nums[right], 2))) {
                arr[pos] = (int) Math.pow(nums[left], 2);
                ++left;
            } else {
                arr[pos] = (int) Math.pow(nums[right], 2);
                --right;
            }
            --pos;
        }

        return arr;
    }

    public static void main(String[] args) {

    }
}
