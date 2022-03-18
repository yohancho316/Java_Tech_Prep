package Algorithm_Implementation;

public class BinarySearch {

    public static int binarySearch_Iterative(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (((right - left) + 1) / 2);
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        int target = 10;
        System.out.println(binarySearch_Iterative(nums, target));
    }
}
