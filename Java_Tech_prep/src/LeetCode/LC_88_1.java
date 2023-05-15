package LeetCode;

public class LC_88_1 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        else if(m == 0) {
            for(int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int left = m - 1;
        int right = nums2.length - 1;
        int pos = nums1.length - 1;

        while(left >= 0 && right >= 0) {
            if(nums1[left] >= nums2[right]) {
                nums1[pos] = nums1[left];
                --left; --pos;
            } else {
                nums1[pos] = nums2[right];
                --right; --pos;
            }
        }

        while(left >= 0 && pos >= 0) {
            nums1[pos] = nums1[left];
            --left; --pos;
        }

        while(right >= 0 && pos >= 0) {
            nums1[pos] = nums2[right];
            --right; --pos;
        }

    }

    public static void main(String[] args) {

    }
}
