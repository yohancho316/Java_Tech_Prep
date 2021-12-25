package LeetCode;
import java.util.*;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1.length == 0) {
            nums1 = nums2.clone();
            return;
        }

        int x = 0;
        for(int i = 0; i < nums2.length - 1; i++) {
            while(nums2[i] >= nums1[x]) {
                x += 1;
            }
            for(int j = nums1.length - 1; j > x; j--) {
               nums1[j] = nums1[j - 1];
            }
            nums1[x] = nums2[i];
        }
        nums1[nums1.length - 1] = nums2[nums2.length - 1];
    }

    public static void main(String[] args) {
        int[] arr1 = {0,10,35,40,0,0,0};
        int[] arr2 = {5,7,10};
        merge(arr1, 3, arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
    }
}
