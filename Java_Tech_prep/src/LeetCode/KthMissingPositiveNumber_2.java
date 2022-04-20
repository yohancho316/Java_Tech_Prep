package LeetCode;

public class KthMissingPositiveNumber_2 {

    public static int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
                // Otherwise, go left.
            } else {
                right = mid - 1;
            }
        }

        return left + k;
    }

    public static void main(String[] args) {

    }
}
