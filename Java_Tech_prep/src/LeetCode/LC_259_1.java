package LeetCode;

import java.util.Arrays;

public class LC_259_1 {

    public static int threeSumSmaller(int[] nums, int target) {
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        int triplets = 0;
        for(int a = 0; a < nums.length - 2; a++) {
            int difference = target - nums[a];
             triplets += twoSumSearch(nums, a + 1, target - nums[a]);
        }
        return triplets;
    }

    public static int twoSumSearch(int[] nums, int left, int target) {
        int triplets = 0;
        for(int b = left; b < nums.length - 1; b++) {
            int max = target - nums[b];
            int difference =  binarySearch(nums, b, max);
            triplets = difference - b;
        }
        return triplets;
    }

    public static int binarySearch(int[] nums, int pos, int max) {
        int left = pos; int right = nums.length - 1;
        while(left < right) {
            int mid = (right + left + 1) / 2;
            if(nums[mid] < 6) left = mid;
            else right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,1,3};
        System.out.println("Triplets: " + threeSumSmaller(nums, 2));

    }
}
