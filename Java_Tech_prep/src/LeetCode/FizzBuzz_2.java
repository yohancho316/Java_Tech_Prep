package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_2 {

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        List<String> list = fizzBuzz(15);
        System.out.println(list.toString());
    }
}