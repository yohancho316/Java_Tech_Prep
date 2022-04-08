package LeetCode;

public class BinarySearch_1 {

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = left + ((right - left) / 2);

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
        System.out.println(search(nums, 15));

    }
}
