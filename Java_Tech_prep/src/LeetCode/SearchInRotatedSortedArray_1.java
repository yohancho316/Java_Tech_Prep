package LeetCode;

public class SearchInRotatedSortedArray_1 {

    public static int search(int[] nums, int target) {

        int left1 = 0; int right1 = 0;
        int left2 = 0; int right2 = nums.length - 1;

        // Check
        if(nums.length == 1) return nums[0] == target ? 0 : -1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i - 1]) {
                right1 = i - 1;
                left2 = i;
                break;
            }
        }

        while(left1 <= right1) {
            int mid = left1 + ((right1 - left1) / 2);
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                right1 = mid - 1;
            } else {
                left1 = mid + 1;
            }
        }

        while(left2 <= right2) {
            int mid = left2 + ((right2 - left2) / 2);
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                right2 = mid - 1;
            } else {
                left2 = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,0,1,2};
        System.out.println(search(nums, 1));
    }
}
