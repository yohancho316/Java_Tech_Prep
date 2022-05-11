package LeetCode;

import java.util.Arrays;

public class MergeSortedArray_5 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Declare an integer array
        int[] merged = new int[m + n];

        // Declare int variables
        int curr_pos = 0;
        int left = 0;
        int right = 0;

        // Loop through elements in both arrays
        while((left < m) && (right < n)) {

            if(nums1[left] <= nums2[right]) {
                merged[curr_pos] = nums1[left];
                ++left;
            } else {
                merged[curr_pos] = nums2[right];
                ++right;
            }
            ++curr_pos;
        }

        // Check for Leftover Elements in Nums1
        while(left < m) {
            merged[curr_pos] = nums1[left];
            ++left;
            ++curr_pos;
        }

        // Check for Leftover Elements in Nums2
        while(right < n) {
            merged[curr_pos] = nums2[right];
            ++right;
            ++curr_pos;
        }

        // Merge the Arrays
        for(int i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }

        System.out.println(Arrays.toString(nums1));

        return;
    }


    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {1,2,3};
        merge(nums1, 3, nums2, nums2.length);


    }
}
