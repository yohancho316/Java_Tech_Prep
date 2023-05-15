package LeetCode;

public class LC_1004_1 {

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        int count = 0;
        int x = k;

        while(right < nums.length) {
            if(nums[right] == 1) {
                ++count;
                ++right;
                if(count > max) max = count;
            } else if(nums[right] == 0){
                if(x > 0) {
                    --x;
                    ++count;
                    ++right;
                    if(count > max) max = count;
                } else {
                    if(nums[left] == 1) {
                        --count;
                    } else if(nums[left] == 0){
                        ++x;
                        --count;
                    }
                    ++left;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println("max: " + longestOnes(nums, 3));
    }
}
