package LeetCode;

public class SearchInsertPosition_2 {

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        if(nums.length == 1 && target <= nums[0]) {
            return 0;
        } else if(nums.length == 1 && nums[0] > target) {
            return 1;
        }

        while(left <= right) {
            int middle = left + ((right - left) + 1) / 2;
            if(target == nums[middle]) {
                return middle;
            } else if(target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        searchInsert(nums, 7);
    }
}
