package LeetCode;

public class RemoveDuplicatesFromSortedArray_3 {

    public static int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        for(;fast < nums.length; ++fast) {
            if(nums[slow] == nums[fast]) {
                continue;
            } else {
                nums[slow + 1] = nums[fast];
                ++slow;
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {

    }
}
