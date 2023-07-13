package LeetCode;

public class LC_35_1 {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left <= right) {
            mid = (Math.abs(right - left) / 2) + left;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {

    }
}
