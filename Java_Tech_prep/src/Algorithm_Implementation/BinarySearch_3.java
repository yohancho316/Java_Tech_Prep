package Algorithm_Implementation;

public class BinarySearch_3 {

    public static int binarySearch_Iterative(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (((right - left) + 1) / 2);
            if(nums[mid] == target) {
                System.out.println("Target Found!");
                return mid;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Target wasn't Found!");
        return -1;
    }

    public static int binarySearch_Recursive(int[] nums, int target, int left, int right) {

        // Base Condition
        if(left > right) {
            System.out.println("Target wasn't Found!");
            return -1;
        }

        int mid = left + (((right - left) + 1) / 2);

        if(nums[mid] == target) {
            System.out.println("Target Found!");
            return mid;
        } else if(target < nums[mid]) {
            return binarySearch_Recursive(nums, target, left, mid - 1);
        } else {
            return binarySearch_Recursive(nums, target, mid + 1, right);
        }
    }


    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};

        // Test Binary Search Iterative
        System.out.println("Testing Binary Search Iterative Method");
        System.out.println(binarySearch_Iterative(nums, 10));

        // Test Binary Search Recursive
        System.out.println("Testing Binary Search Recursive Method");
        System.out.println(binarySearch_Iterative(nums, 25));
    }
}
