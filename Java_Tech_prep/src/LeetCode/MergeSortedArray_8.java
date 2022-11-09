package LeetCode;

public class MergeSortedArray_8 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            int x = 0;
            for(Integer num : nums2) {
                nums1[x] = num; ++x;
            }
            return;
        } else if(n == 0) return;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums = new int[m + n];

        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                nums[k] = nums1[i];
                ++i; ++k;
            } else {
                nums[k] = nums2[j];
                ++j; ++k;
            }
        }

        while(i < m) {
            nums[k] = nums1[i];
            ++i; ++k;
        }

        while(j < n) {
            nums[k] = nums2[j];
            ++j; ++k;
        }

        for(int x = 0; x < nums.length; x++) {
            nums1[x] = nums[x];
        }
    }

    public static void main(String[] args) {

    }
}
