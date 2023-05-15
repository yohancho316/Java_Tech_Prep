package LeetCode;

public class LC_283_1 {

    public static void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int slow = 0; int fast = 0;

        while(fast < nums.length) {

            if(nums[fast] == 0) {
                ++fast;
                continue;
            }

            if((nums[slow] == nums[fast]) && (slow == fast)) {
                ++slow; ++fast;
                continue;
            }

            nums[slow] = nums[fast];
            ++slow; ++fast;
        }

        while(slow < nums.length) {
            nums[slow] = 0;
            ++slow;
        }
    }

    public static void main(String[] args) {

    }
}
