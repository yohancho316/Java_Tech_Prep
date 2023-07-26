package LeetCode;

public class LC_11_2 {

    public static int maxArea(int[] height) {
        if(height.length == 2) return Math.min(height[0],height[1]);
        int left = 0; int right = height.length - 1; int max = Integer.MIN_VALUE;
        while(left < right) {
            int min = Math.min(height[left], height[right]);
            int volume = Math.abs(right - left) * min;
            max = Integer.max(max, volume);
            if(height[right] > height[left]) ++left;
            else --right;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max: " + maxArea(nums));
    }
}
