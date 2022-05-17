package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII_2 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums1.length; i++) {

            if(map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String[] args) {
        int[] nums1 = {3,1,2,3};
        int[] nums2 = {5,1,2,3,3};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
