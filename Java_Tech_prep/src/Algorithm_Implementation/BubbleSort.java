package Algorithm_Implementation;
import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < (arr.length - i); j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] unsorted_array = {50, 10, 100, 20, 40, 30, 90, 70, 80, 60, 0};
        System.out.println("Unsorted Array: " + Arrays.toString(unsorted_array));
        System.out.println("Sorted Array: " + Arrays.toString(bubbleSort(unsorted_array)));
    }
}
