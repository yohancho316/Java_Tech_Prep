package CodeWars;
import java.util.*;

public class SpinningWords {

    public static String spinWords(String sentence) {

        // Local Declarations
        String return_str = "";
        String[] sentence_arr = sentence.split(" ");

        // Reverse Words of Length 5 or Greater
        for(int i = 0; i < sentence_arr.length; i++) {
            if(sentence_arr[i].length() <= 4) {
                return_str += sentence_arr[i] + " ";
            } else {
                String reversed_word = "";
                for(int j = sentence_arr[i].length() - 1; j >= 0; j--) {
                    reversed_word += sentence_arr[i].charAt(j);
                }
                return_str += reversed_word + " ";
            }
        }

        return return_str.substring(0, return_str.length() - 1);
    }


    public static void main(String[] args) {
        String sentence = "";
        System.out.println(spinWords(sentence));
    }
}
