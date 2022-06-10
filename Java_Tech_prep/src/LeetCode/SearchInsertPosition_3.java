package LeetCode;

public class SearchInsertPosition_3 {

    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 1 && target <= nums[0]) return 0;
        if(nums.length == 1 && target > nums[0]) return 1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int middle = left + ((right - left) / 2);
            if(nums[middle] == target) return middle;
            else if(target < nums[middle]) right = middle - 1;
            else left = middle + 1;
        }
        return right + 1;
    }

    public static void main(String[] args) {
        int[] nums = {-10,-5,-3,0,1,5,10};
        System.out.println(searchInsert(nums, 4));
    }
}
