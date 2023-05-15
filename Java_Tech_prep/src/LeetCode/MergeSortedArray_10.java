package LeetCode;

import java.util.Arrays;

public class MergeSortedArray_10 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m == 0) {
            for(int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        } else if(n == 0) return;

        int size = nums1.length - 1;

        for(int i = m - 1; i >= 0; i--) {
            nums1[size] = nums1[i];
            --size;
        }

        int pos = 0; int left = m; int right = 0;

        while(left < nums1.length && right < nums2.length) {
            if(nums1[left] <= nums2[right]) {
                nums1[pos] = nums1[left];
                ++pos; ++left;
            } else {
                nums1[pos] = nums2[right];
                ++pos; ++right;
            }
        }

        while(right < nums2.length) {
            nums1[pos] = nums2[right];
            ++pos; ++right;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {4,5,6,7};
        System.out.println("Before: " + Arrays.toString(nums1));
        merge(nums1, 3, nums2, 4);
        System.out.println("After: " + Arrays.toString(nums1));

    }
}
