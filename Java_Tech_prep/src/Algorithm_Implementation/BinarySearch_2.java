package Algorithm_Implementation;

public class BinarySearch_2 {


    public static int binarySearch_Iterative(int[] nums, int target) {
        if(nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (((right - left) + 1) / 2) + left;
            if(target == nums[mid]) {
                return mid;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch_Recursive(int[] nums, int target, int left, int right) {

        int mid = (((right - left) + 1) / 2) + left;

        if(left > right) {
            return -1;
        } else if(target == nums[mid]) {
            return mid;
        }

        if(target < nums[mid]) {
            return binarySearch_Recursive(nums, target, left, mid - 1);
        } else {
            return binarySearch_Recursive(nums, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(binarySearch_Iterative(nums, 100));
        System.out.println(binarySearch_Recursive(nums, 100, 0, 9));
    }
}
