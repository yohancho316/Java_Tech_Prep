package LeetCode;

public class RemoveDuplicatesFromSortedArray_8 {

    public static int removeDuplicates(int[] nums) {

        if(nums.length == 1) return 1;

        int left = 0;
        int right = 1;

        while(right < nums.length) {
            if(nums[right] != nums[left]) {
                if(nums[right] == nums[left + 1]) {
                    ++left;
                    ++right;
                } else {
                    nums[++left] = nums[right];
                    ++right;
                }
            } else {
                ++right;
            }
        }
        return ++left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(removeDuplicates(nums));
    }
}
