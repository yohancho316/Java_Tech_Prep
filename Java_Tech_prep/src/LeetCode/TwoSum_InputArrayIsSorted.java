package LeetCode;
import java.util.Arrays;

public class TwoSum_InputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        // Local Declarations
        int start = 0;
        int end = numbers.length - 1;
        int[] return_arr = new int[2];

        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                return_arr[0] = ++start;
                return_arr[1] = ++end;
                return return_arr;
            } else if(sum > target) {
                --end;
            } else {
                ++start;
            }
        }
        return return_arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
