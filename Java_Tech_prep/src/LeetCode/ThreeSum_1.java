package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum_1 {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int a = 0; a < nums.length; a++) {
            map.put(nums[a], a);
        }

        for(int i = 0; i < nums.length; i++) {
            int diff = 0 - nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    int z = diff - nums[j];
                    if(map.containsKey(z) && ((i != map.get(z)) && (j != map.get(z)))) {
                        if((nums[i] + nums[j] + z) == 0) {
                            List<Integer> arr = new ArrayList<Integer>();
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(z);
                            list.add(arr);
                        }
                    }
                }
            }
        }

        for(List inner: list) {
            for(int i = 0; i < inner.size(); i++) {
                System.out.print(inner.get(i) + "\t");
            }
            System.out.println();
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}
