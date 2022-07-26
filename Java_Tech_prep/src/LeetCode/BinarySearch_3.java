package LeetCode;

public class BinarySearch_3 {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int middle = ((right - left) / 2) + left;
            if(nums[middle] == target) return middle;
            else if(target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-5, -3, 0, 1, 4, 6, 8, 10, 13, 15, 23};
        System.out.println(search(nums, 7));
    }
}
