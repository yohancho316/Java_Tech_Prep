package LeetCode;

import java.util.Arrays;

public class MergeSortedArray_7 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1 == null || nums2 == null || n == 0) return;
        if(m == 0) {
            for(int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int pos = nums1.length - 1;
        --m; --n;

        while((pos >= 0) && ((m >= 0) && (n >= 0))) {
            if(nums1[m] >= nums2[n]) {
                nums1[pos] = nums1[m];
                --m; --pos;
            } else {
                nums1[pos] = nums2[n];
                --n; --pos;
            }
        }

        while(m >= 0) {
            nums1[pos] = nums1[m];
            --m; --pos;
        }

        while(n >= 0) {
            nums1[pos] = nums2[pos];
            --n; --pos;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
    }
}
