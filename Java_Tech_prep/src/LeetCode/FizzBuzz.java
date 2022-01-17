package LeetCode;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        // Local Declarations
        List<String> list = new ArrayList<>();

        // Iterate from 1 - N
        for(int i = 1; i <= n; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                list.add("FizzBuzz");
            } else if(i % 3 == 0) {
                list.add("Fizz");
            } else if(i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
}
