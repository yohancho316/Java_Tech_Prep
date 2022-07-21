package LeetCode;

public class RemoveElement_3 {

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int left = 0;
        int right = 0;
        int swaps = 0;

        while(right < nums.length) {
            if(nums[right] == val) {
                ++right;
            } else {
                nums[left] = nums[right];
                ++left;
                ++right;
                ++swaps;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,3,5,3};
        System.out.println(removeElement(nums, 3));
    }
}
