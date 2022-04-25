package Technical_Interviews;
import java.util.ArrayList;

public class Arete_Exercise_Four {

    public static char[] swap(char[] items, int left, int i) {

        char temp = items[left];
        items[left] = items[i];
        items[i] = temp;
        return items;

    }

    public static void findAllPermutations(char[] items, int left, int right, ArrayList<String> list) {


        // Step 1: Check if Char Array Argument is Null. Throw the NullPointerException Runtime Exception if True
        if(items == null) throw new NullPointerException("Input cannot be Null");


        // Step 2: Check if ArrayList Argument is Null. Throw the NullPointerException Runtime Exception if True
        if(list == null) throw new NullPointerException("ArrayList cannot be Null");


        // Step 2: Check if Char Array Argument is Empty. Throw the Illegal Argument Runtime Exception if True.
        if(items.length == 0) throw new IllegalArgumentException("Array cannot be Empty");


        // Step 3: Check if Array items Length == 1. Insert Single Element to ArrayList & Return.
        if(items.length == 1)
        {
            list.add(new String(items));
            return;
        }


        // Step 4: Check if Left is Out of Bounds. Throw the ArrayIndexOutOfBounds Runtime Exception if True.
        if(left < 0 || left >= items.length) throw new ArrayIndexOutOfBoundsException("Left is out of Bounds");


        // Step 5: Check if Right is out of Bounds. Throw the ArrayIndexOutOfBounds Runtime Exception if True.
        if(right < 0 || right >= items.length) throw new ArrayIndexOutOfBoundsException("Right is out of Bounds");


        // Step 5: If left == right, add the String Concatenation of Elements in item to ArrayList
        if(left == right)
        {
            list.add(new String(items));
        }

        else
        {
            for(int i = left; i <= right; i++)
            {
                items = swap(items, left, i);
                findAllPermutations(items, left + 1, right, list);

                // Perform Back Tracking to Retain Previous Position
                items = swap(items, left, i);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = null;
        char[] items = {'a', 'b', 'c'};
        char[] items2 = {'a'};
        char[] items3 = {};
        int right = items.length - 1;
        findAllPermutations(items, 0, right, list);


        System.out.println("\n\n\nFinal List: " + list.toString());
    }
}
