package LeetCode;

public class SearchInsertPosition_5 {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = ((right - left) / 2) + left;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,4,6};
        System.out.println("Index Pos: " + searchInsert(nums, 7));
    }
}
