package LeetCode;

public class MergeSortedArray_6 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n == 0) return;

        if(m == 0) {
            for(int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int x = 0;
        int y = 0;
        int pos = 0;
        int[] arr = new int[nums1.length];

        while(x < m && y < n) {
            if(nums1[x] <= nums2[y]) {
                arr[pos] = nums1[x];
                ++pos;
                ++x;
            } else {
                arr[pos] = nums2[y];
                ++pos;
                ++y;
            }
        }

        while(x < m) {
            arr[pos] = nums1[x];
            ++x;
            ++pos;
        }

        while(y < n) {
            arr[pos] = nums2[y];
            ++y;
            ++pos;
        }

        for(int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }
    }

    public static void main(String[] args) {

    }
}
