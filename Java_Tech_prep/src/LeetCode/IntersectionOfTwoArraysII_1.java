package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class IntersectionOfTwoArraysII_1 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums1.length; i++) {
            if(map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }

        for(int j = 0; j < nums2.length; j++) {
            if(map2.containsKey(nums2[j])) {
                map2.put(nums2[j], map2.get(nums2[j]) + 1);
            } else {
                map2.put(nums2[j], 1);
            }
        }

        List<Integer> intersects = new ArrayList<Integer>();

        for(Integer key : map1.keySet()) {
            int count = 0;
            if(map2.containsKey(key)) {
                if(map1.get((Integer)key) <= map2.get(key)) {
                    count = map1.get(key);
                } else {
                    count = map2.get(key);
                }

                for(int k = 0; k < count; k++) {
                    intersects.add(key);
                }
            }
        }

        return intersects.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3};
        int[] nums2 = {4,5,6};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
