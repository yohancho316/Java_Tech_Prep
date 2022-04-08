package LeetCode;

public class BinarySearch_2 {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = findPos(nums, left, right, target);
        return position;
    }

    public static int findPos(int[] nums, int left, int right, int target) {

        // Base Condition
        if(left > right) {
            return -1;
        }

        int mid = left + ((right - left) / 2);

        if(nums[mid] == target) {
            return mid;
        } else if(target < nums[mid]) {
            return findPos(nums, left, mid - 1, target);
        } else {
            return findPos(nums, mid + 1, right, target);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(nums, 10));
    }
}
