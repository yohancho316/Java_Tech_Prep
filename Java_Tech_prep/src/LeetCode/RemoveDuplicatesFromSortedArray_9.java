package LeetCode;

public class RemoveDuplicatesFromSortedArray_9 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1) return nums.length;

        int slow = 0;
        int fast = 1;

        while(fast < nums.length) {
            if(nums[slow] == nums[fast]) ++fast;
            else nums[++slow] = nums[fast++];
        }

        return ++slow;
    }

    public static int removeDuplicates2(int[] nums) {
        if(nums.length == 1) return nums.length;

        int index = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,5};
        System.out.println("Unique Count: " + removeDuplicates(nums));
    }
}
