package LeetCode;
import java.util.Arrays;

public class TwoSum_SortedArray {

    public static int[] twoSum(int[] numbers, int target) {

        // Local Declarations
        int[] return_arr = new int[2];
        int head = 0;
        int tail = numbers.length - 1;

        // Iterate through Nums
        while(head < tail) {

            // Calculate Sum of Head + Tail Elements
            int sum = numbers[head] + numbers[tail];

            if(sum == target) {
                return_arr[0] = ++head;
                return_arr[1] = ++tail;
                break;
            } else if(sum > target) {
                --tail;
            } else {
                ++head;
            }
        }
        return return_arr;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(twoSum(nums,11)));
    }
}
