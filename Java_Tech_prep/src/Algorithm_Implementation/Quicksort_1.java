package Algorithm_Implementation;

import java.util.Arrays;
import java.util.Random;

public class Quicksort_1 {

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int left = low;
        int right = high - 1;

        while (left < right) {

            while((arr[left] <= pivot) && (left < right)) {
                ++left;
            }

            while((arr[right] >= pivot) && (left < right)) {
                --right;
            }

            swap(arr, left, right);
        }

        if(arr[left] > arr[high]) swap(arr, left, high);
        else left = high;
        return left;
    }

    public static void quickSort(int[] arr, int low, int high) {

        // Base Case
        if(low >= high) return;

        int pivotIndex = new Random().nextInt(high - low) + low;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high);

        System.out.println("Pivot Index: " + pivotIndex);
        System.out.println("Pivot Value: " + pivot);
        System.out.println("After Pivot: " + Arrays.toString(arr));

        pivot = partition(arr, low, high, pivot);

        System.out.println("New Left: " + pivot);
        System.out.println("After Partition: " + Arrays.toString(arr));
        System.out.println();
        System.out.println();

        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);

    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        quickSort(arr,0,arr.length - 1);


        System.out.println("\n\nSorted Array: " + Arrays.toString(arr));
    }
}
