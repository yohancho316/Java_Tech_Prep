package LeetCode;

public class BinarySearch_4 {

    public static int search(int[] nums, int target) {

        if(target < nums[0] || target > nums[nums.length - 1]) return -1;

        int left = 0;
        int right = nums.length - 1;
        int mid = ((right - left) / 2) + left;

        while(left <= right) {
            mid = ((right - left) / 2) + left;
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Index Position: " + search(nums, 8));
    }
}
