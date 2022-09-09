package LeetCode;

public class SearchInsertPosition_4 {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left <= right) {
            mid = ((right - left) / 2) + left;

            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }

        if(target > nums[mid]) return ++mid;

        return mid;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
}
