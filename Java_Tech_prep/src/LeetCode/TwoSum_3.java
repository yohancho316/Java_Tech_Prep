package LeetCode;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_3 {

    public static int[] twoSum(int[] nums, int target) {
        // Local Declarations
        HashMap<Integer,Integer> table = new HashMap<Integer,Integer>();
        int[] arr = new int[2];

        // Iterate through the Integer Array nums
        for(int i = 0; i < nums.length; i++) {
            if(!table.containsKey(nums[i])) {
                table.put(nums[i],i);
            }

            int difference = target - nums[i];

            if(table.containsKey(difference) && table.get(difference) != i) {
                arr[0] = table.get(difference);
                arr[1] = i;
                return arr;
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
}
