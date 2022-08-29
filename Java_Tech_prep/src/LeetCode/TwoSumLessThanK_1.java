package LeetCode;

public class TwoSumLessThanK_1 {

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void quickSort(int[] nums, int low, int high) {

        if(low >= high) return;

        int pivot = nums[high];
        int left = low;
        int right = high;

        while(left < right) {

            while((nums[left] <= pivot) && (left < right)) {
                ++left;
            }

            while((nums[right] >= pivot) && (left < right)) {
                --right;
            }

            swap(nums,left,right);
        }

        swap(nums,left, high);

        quickSort(nums, low, left - 1);
        quickSort(nums,left + 1, high);
    }

    public static int twoSumLessThanK(int[] nums, int k) {
        int maxSum = -1;
        quickSort(nums,0,nums.length - 1);

        int sum = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            sum = nums[left] + nums[right];
            if(sum < k && sum > maxSum) maxSum = sum;

            if(sum >= k) {
                --right;
            } else {
                ++left;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.println("max sum: " + twoSumLessThanK(nums, 6));
    }
}
