package LeetCode;

public class LC_27_1 {

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return nums.length;
        int slow = 0; int fast = 0;
        while(fast < nums.length) {

            if(nums[fast] == val) {
                ++fast;
                continue;
            }

            if((nums[slow] == nums[fast]) && (slow == fast)) {
                ++slow; ++fast;
                continue;
            }

            nums[slow++] = nums[fast++];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,2,2};
        int x = 3;
        System.out.println(removeElement(nums, x));
    }
}
