package LeetCode;

public class KthMissingPositiveNumber_1 {

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            int mid = left + (((right - left) + 1) / 2);

            if(arr[mid] == target) {
                return true;
            } else if(target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static int findKthPositive(int[] arr, int k) {

        int step = 0;
        int count = 1;

        while(step != k) {
            System.out.println("Count: " + count);
            if(binarySearch(arr, count)) {
                ++count;
            } else {
                ++step;
                ++count;
            }
        }

        return count - 1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }
}
