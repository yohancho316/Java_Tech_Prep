package LeetCode;

public class RemoveDuplicatesFromSortedArray_2 {

    public static int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;

        for(;fast < nums.length; ++fast) {
            if(nums[slow] != nums[fast]) {
                nums[slow + 1] = nums[fast];
                ++slow;
            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4,4,4,5};
        System.out.println(removeDuplicates(nums));
    }
}
