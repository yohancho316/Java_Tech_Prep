package LeetCode;

public class RemoveDuplicatesFromSortedArray_5 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;

        int slow = 0;
        int fast = 0;

        while(fast < nums.length) {
            if(nums[slow] == nums[fast]) {
                fast += 1;
            } else if(nums[fast] > nums[slow]) {
                nums[++slow] = nums[fast++];
            }
        }
        return ++slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,3,4,5};
        System.out.println(removeDuplicates(nums));
    }
}
