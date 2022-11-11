package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfArithmeticTriplets_1 {

    public static int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set<String> set = new HashSet<String>();

        int left = 0; int right = nums.length - 1;

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(; left < right - 1; ++left) {
            int sum = nums[left] + diff;
            int difference = nums[right] - diff;

            if((map.containsKey(sum) && map.containsKey(difference)) && (map.get(sum) == map.get(difference)) && (sum > nums[left]) && (sum < nums[right])) {
                set.add("" + left + "" + sum + "" + right);
                System.out.println("Add");
            }
        }

        left = 0; right = nums.length - 1;

        for(; right > left + 1; --right) {
            int sum = nums[left] + diff;
            int difference = nums[right] - diff;

            if((map.containsKey(sum) && map.containsKey(difference)) && (map.get(sum) == map.get(difference)) && (sum > nums[left]) && (sum < nums[right])) {
                set.add("" + left + "" + sum + "" + right);
                System.out.println("Add");
            }
        }
        System.out.println("Size of Set: " + set.size());
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        System.out.println("Triplets: " + arithmeticTriplets(nums, 3));
    }
}
