package LeetCode;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        // Local Declarations
        int array_sum = 0, true_sum = 0;

        // Iterate through Elements of Nums
        for(int i = 0; i < nums.length; i++) {
            array_sum += nums[i];
            true_sum += (i + 1);
        }

        return true_sum - array_sum;
    }


    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(missingNumber(arr));
    }
}
