package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class NextGreaterElementI_1 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int pos = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        for(int i = 0; i < nums1.length; ++i, ++pos) {
            boolean found = false;
            if(map.get(nums1[i]) == nums2.length - 1) {
                arr[pos] = -1;
                continue;
            }

            for(int j = map.get(nums1[i]) + 1; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]) {
                    arr[pos] = nums2[j];
                    found = true;
                    break;
                }
            }
            if(!found) {
                arr[pos] = -1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};      // Length = 7
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

}
