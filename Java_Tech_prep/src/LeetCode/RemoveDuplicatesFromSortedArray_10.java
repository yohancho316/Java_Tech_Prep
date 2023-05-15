package LeetCode;

public class RemoveDuplicatesFromSortedArray_10 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int k = 1; int left = 0; int right = 1;
        while(right < nums.length) {
            if(nums[left] != nums[right]) {
                nums[++left] = nums[right];
                ++k;
                ++right;
            } else {
                ++right;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,3,4,5,5};
        System.out.println("K = " + removeDuplicates(nums));
    }
}
