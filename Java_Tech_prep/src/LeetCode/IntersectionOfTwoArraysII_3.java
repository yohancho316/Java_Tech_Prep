package LeetCode;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArraysII_3 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> mapA = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> mapB = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums1.length; i++) {
            mapA.put(nums1[i], mapA.getOrDefault(nums1[i],0) + 1);
        }

        for(int i = 0; i < nums2.length; i++) {
            mapB.put(nums2[i], mapB.getOrDefault(nums2[i],0) + 1);
        }

        for(int i = 0; i < nums1.length; i++) {
            if(mapA.containsKey(nums1[i]) && mapB.containsKey(nums1[i])) {
                int count = Math.min(mapA.get(nums1[i]), mapB.get(nums1[i]));
                for(int j = 0; j < count; j++) {
                    list.add(nums1[i]);
                }
                mapA.remove(nums1[i]);
                mapB.remove(nums1[i]);
            }
        }
        int pos = 0;
        int[] return_list = new int[list.size()];
        for(Integer i : list) {
            return_list[pos++] = i;
        }
        return return_list;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,4};
        int[] nums2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
