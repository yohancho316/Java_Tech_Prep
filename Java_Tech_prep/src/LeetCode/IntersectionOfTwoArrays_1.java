package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays_1 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        int size = nums1.length > nums2.length ? nums1.length : nums2.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[size];
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        int pos = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums1.length; i++) {

            int val = nums1[i];

            if(!map.containsKey(val)) {
                map.put(val, true);
            }
        }

        for(int j = 0; j < nums2.length; j++) {

            int val = nums2[j];

            if(map.containsKey(val) && map.get(val) == true) {
                list.add(val);
                arr[pos] = val;
                pos++;
                set.add(val);
                map.replace(val, false);
            }
        }


        int[] new_arr = new int[list.size()];
        pos = 0;

        for(Integer x : list) {
            new_arr[pos] = x;
            pos++;
        }

        return new_arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {3,4,5};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
