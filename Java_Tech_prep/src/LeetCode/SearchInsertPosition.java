package LeetCode;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        if(nums.length == 1 && target < nums[0]) return 0;
        else if(nums.length == 1 && target > nums[0]) return 1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int middle = left + (((right - left) + 1) / 2);
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
        int[] nums = {1,3};
        System.out.println(searchInsert(nums,-7));
    }
}
