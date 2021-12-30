/*
URL: https://www.codewars.com/kata/5541f58a944b85ce6d00006a
Difficulty: 5-Kyu
Time Complexity: O(1)
Space Complexity: O(1)
 */

package CodeWars;

import java.util.Arrays;

public class ProductOfConsecutiveFibNumbers {

    public static long[] productFib(long prod) {

        // Local Declarations
        long start = 0;
        long end = 1;
        long current = 0;
        long product = 0;
        long[] return_arr = new long[3];
        boolean foundProduct = false;

        while(product <= prod) {

            // Calculate Next Fib Sequence
            current = start + end;

            // Update Start & End Variables
            start = end;
            end = current;

            // Calculate the Product
            product = start * end;

            // Check if Product == Prod
            if(product == prod) {
                foundProduct = true;
                break;
            }
        }

        return_arr[0] = start;
        return_arr[1] = end;

        if(foundProduct) {
            return_arr[2] = (long) 1;
        } else {
            return_arr[2] = (long) 0;
        }

        return return_arr;
    }

    public static void main(String[] args) {

        long prod = 715;
        System.out.println(Arrays.toString(productFib(prod)));
    }
}
