package LeetCode;

import java.util.Arrays;

public class MergeSortedArray_11 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0) {
            for(int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int pos = nums1.length - 1;
        int left = m - 1;
        int right = nums2.length - 1;

        while(left >= 0 && right >= 0) {
            if(nums1[left] >= nums2[right]) {
                nums1[pos] = nums1[left];
                --pos;
                --left;
            } else {
                nums1[pos] = nums2[right];
                --pos;
                --right;
            }
        }

        while(right >= 0) {
            nums1[pos] = nums2[right];
            --pos;
            --right;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        System.out.println("Pre: " + Arrays.toString(nums1));
        merge(nums1, 3, nums2, 3);
        System.out.println("After: " + Arrays.toString(nums1));
    }
}
