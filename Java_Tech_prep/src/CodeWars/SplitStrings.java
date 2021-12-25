/*
URL: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/java
Difficulty: 6-Kyu
Time Complexity: O(N)
Space Complexity: O(N)

 */

package CodeWars;
import java.util.Arrays;

public class SplitStrings {

    public static String[] stringSplit(String s) {

        int size = (s.length() / 2) + (s.length() % 2);
        String[] return_arr = new String[size];
        int start = 0;

        if(s.length() % 2 != 0) {
            s += "_";
        }

        for(int i = 0; i < size; i++) {
            return_arr[i] = s.substring(start, start + 2);
            start += 2;
        }

        return return_arr;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(Arrays.toString(stringSplit(str)));

    }
}
