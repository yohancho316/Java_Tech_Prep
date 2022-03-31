package LeetCode;

import java.util.Arrays;

public class MergeSortedArray_4 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0, p2 = 0, p3 = 0;
        int[] merged_arr = new int[m + n];

        while(p1 < m && p2 < n) {
            if(nums1[p1] <= nums2[p2]) {
                merged_arr[p3] = nums1[p1];
                ++p1;
                ++p3;
            } else {
                merged_arr[p3] = nums2[p2];
                ++p2;
                ++p3;
            }
        }

        while(p1 < m) {
            merged_arr[p3] = nums1[p1];
            ++p1;
            ++p3;
        }

       while(p2 < n) {
            merged_arr[p3] = nums2[p2];
            ++p2;
            ++p3;
        }

        for(int i = 0; i < merged_arr.length; i++) {
            nums1[i] = merged_arr[i];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {};
        int m = 3;
        int n = 0;

        System.out.println("Before Merge: " + Arrays.toString(nums1));
        merge(nums1, m, nums2, n);
        System.out.println("After Merge: " + Arrays.toString(nums1));


    }
}
