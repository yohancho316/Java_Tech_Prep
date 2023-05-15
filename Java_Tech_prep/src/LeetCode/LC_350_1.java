package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_350_1 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        if(nums2.length > nums1.length) intersect(nums2, nums1);

        List<Integer> arr = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for(int j = 0; j < nums2.length; j++) {
            if((map.containsKey(nums2[j])) && (map.get(nums2[j]) != null) && (map.get(nums2[j]) >= 1)) {
                arr.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }

        int[] list = arr.stream().mapToInt(Integer::intValue).toArray();
        return list;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,1};
        intersect(nums1, nums2);
    }
}
