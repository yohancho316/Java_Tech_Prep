package LeetCode;

public class LC_11_1 {

    public static int maxArea(int[] height) {

        int left = 0; int right = height.length - 1; int max = Integer.MIN_VALUE;

        while(left < right) {
            if((Math.min(height[left], height[right]) * (right - left)) > max) {
                max = (Math.min(height[left], height[right]) * (right - left));
            }

            if(height[left] <= height[right]) ++left;
            else --right;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max Area: " + maxArea(height));
    }
}
