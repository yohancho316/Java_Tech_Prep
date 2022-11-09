package LeetCode;

public class MergeSortedArray_9 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            for(int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        } else if(n == 0) return;

        int pos = nums1.length - 1; --m; --n;

        while(m >= 0 && n >= 0) {
            if(nums1[m] >= nums2[n]) {
                nums1[pos] = nums1[m];
                --m; --pos;
            } else {
                nums1[pos] = nums2[n];
                --n; --pos;
            }
        }
        while(n >= 0) {
            nums1[pos] = nums2[n];
            --n; --pos;
        }
    }

    public static void main(String[] args) {

    }
}
