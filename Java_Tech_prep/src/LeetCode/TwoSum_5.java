package LeetCode;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_5 {

    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 2) return new int[] {0,1};

        int[] sum = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if((map.containsKey(difference)) && (map.get(difference) != i)) {
                sum[0] = map.get(difference);
                sum[1] = i;
                return sum;
            } else {
                map.put(nums[i], i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(Arrays.toString(twoSum(nums, 4)));
    }
}
