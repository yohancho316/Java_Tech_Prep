package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII_4 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        if(nums2.length > nums1.length) {
            return intersect(nums2, nums1);
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int pos = 0;

        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for(int j = 0; j < nums2.length; j++) {
            if(map.containsKey(nums2[j])) {
                if(nums2[pos] != nums2[j]) {
                    nums2[pos] = nums2[j];
                }
                ++pos;
                if(map.get(nums2[j]) >= 2) {
                    map.put(nums2[j], map.get(nums2[j]) - 1);
                } else {
                    map.remove(nums2[j]);
                }
            }
        }

        return Arrays.copyOfRange(nums2, 0, pos);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2,3,3,4,4};
        int[] nums2 = {4,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
