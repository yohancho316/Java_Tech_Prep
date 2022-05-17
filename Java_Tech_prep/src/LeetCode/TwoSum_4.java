package LeetCode;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_4 {

    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            if((map.containsKey(diff)) && (map.get(diff) != j)) {
                arr[0] = j;
                arr[1] = map.get(diff);
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(twoSum(nums, 2)));
    }
}
