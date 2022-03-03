package LeetCode;

public class RemoveElement_2 {

    public static int removeElement(int[] nums, int val) {
        // Local Declarations
        int slow = 0, fast = 0, swaps = 0;

        if(nums.length == 0) return 0;
        if(nums.length == 1 && nums[0] == val) return 0;
        if(nums.length == 1 && nums[0] != val) return 1;

        for(;fast < nums.length; ++fast) {

            if(nums[fast] != val) {
                if(slow == fast) {
                    ++swaps;
                    ++slow;
                } else {
                    nums[slow] = nums[fast];
                    nums[fast] = val;
                    ++swaps;
                    ++slow;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] nums = {4,4,4,4,4,3};
        System.out.println(removeElement(nums,4));
    }
}
