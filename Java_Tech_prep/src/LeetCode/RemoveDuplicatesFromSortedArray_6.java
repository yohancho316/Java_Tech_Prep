package LeetCode;

public class RemoveDuplicatesFromSortedArray_6 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int slow = 0;
        int fast = 0;
        while(fast < nums.length) {
            if(nums[slow] == nums[fast])
            {
                ++fast;
            }
            else
            {
                ++slow;
                nums[slow] = nums[fast];
                ++fast;
            }
        }
        return ++slow;
    }

    public static void main(String[] args) {
        int[] nums = {-50,1,1,1,1,1,2,2,2,100};
        System.out.println(removeDuplicates(nums));
    }
}
