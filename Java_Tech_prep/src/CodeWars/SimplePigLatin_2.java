package CodeWars;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SimplePigLatin_2 {

    public static String pigIt(String str) {

        // Local Declarations
        List<String> split_string = new ArrayList<String>(Arrays.asList(str.split(" ")));
        String return_str = "";

        // Check for Empty String
        if(str.isEmpty()) return str;

        // Iterate through Split String Array
        for(String word : split_string) {
            if(word.contains("!") || word.contains("?") || word.contains(".")
            || word.contains(",") || word.contains("\"") || word.contains("-")) {
                return_str += word + " ";
            } else {
                String first = word.substring(1);
                String second = word.substring(0,1);
                return_str += (first + second + "ay ");
            }
        }
        return return_str.substring(0,return_str.length() - 1);
    }

    public static void main(String[] args) {
        String sentence = "";
        System.out.println(pigIt(sentence));
    }
}
