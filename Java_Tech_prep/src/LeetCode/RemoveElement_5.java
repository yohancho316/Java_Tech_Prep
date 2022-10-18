package LeetCode;

public class RemoveElement_5 {

    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;

        int pos = 0;
        int fast = 0;
        int k = 0;

        while(fast < nums.length) {
            if(nums[fast] == val) {
                ++fast;
                continue;
            } else {
                nums[pos] = nums[fast];
                ++pos;
                ++fast;
                ++k;
            }
        }
        return k;
    }

    public static void main(String[] args) {

    }
}
