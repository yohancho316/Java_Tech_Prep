package LeetCode;

public class LC_26_1 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int left = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[left] != nums[i]) {
                nums[++left] = nums[i];
            }
        }
        return ++left;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,1,2};
        System.out.println("Distinct #'s: " + removeDuplicates(nums));

    }
}
