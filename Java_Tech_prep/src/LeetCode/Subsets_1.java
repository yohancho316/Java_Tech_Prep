package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subsets_1 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<List<Integer>>();
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();

        for(int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j < nums.length; j++) {
                if(i == j) {
                    list.add(i);
                    subset.add(list);
                } else {
                    int left = Character.hashCode(("" + nums[i]).charAt(0));
                    int right = Character.hashCode(("" + nums[j]).charAt(0));
                    int sum = left + right;
                    if(!map.containsKey(sum)) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        map.put(sum,list);
                        subset.add(list);
                    }
                }
                list = new ArrayList<Integer>();
            }
        }



        return subset;
    }

    public static void main(String[] args) {

    }

}
