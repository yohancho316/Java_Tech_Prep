/*
URL: https://leetcode.com/problems/merge-sorted-array/
Difficulty: Easy
Time Complexity: O(M + N)
Space Complexity: O(M + N)
 */


package LeetCode;
import java.util.Arrays;
import java.lang.reflect.Array;

public class MergeSortedArray_2 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Local Declarations
        int[] return_arr = new int[m + n];
        int s1 = 0, s2 = 0, current = 0, start = 0, end = 0;

        // Iterate through Lengths of Arrays nums1 & nums2
        while((s1 < m) && (s2 < n)) {
            if(nums1[s1] < nums2[s2]) {
                return_arr[current] = nums1[s1];
                ++s1;
            } else {
                return_arr[current] = nums2[s2];
                ++s2;
            }
            ++current;
        }

        if(s1 == m && s2 != n) {
            System.arraycopy(nums2, s2, return_arr, current,n - s2);
        } else if(s1 != m && s2 == n) {
            System.arraycopy(nums1, s1, return_arr, current, m - s1);
        }

        // Reassign Reference of return_arr to nums1
        System.arraycopy(return_arr, 0, nums1, 0, m + n);
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
    }
}
