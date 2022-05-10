package Technical_Interviews;

public class Arete_Exercise_One {

    // Method should return the largest string
    public static String longestWord(String str) {

        // Step 1: Declare & Initialize Local Variables
        String longestWord = "";


        // Step 2: Check if String Argument is Null. Throw the Null Pointer Runtime Exception if True
        if(str == null) throw new NullPointerException("Input cannot be Null");


        // Step 3: Check if String is Empty. Throw the Illegal Argument Runtime Exception if True.
        if(str.isEmpty()) throw new IllegalArgumentException("Input cannot be an Empty String");


        // Step 4: Use the String.split() Method to Return an Array of String Elements Separated by the REGEX Delimiter
        String[] words = str.split("\\p{Space}");


        // Step 5: Use a For-Each Loop to Iterate through String Elements in Array words & Find Longest String Element
        for(String current : words)
        {

            // Step 6: Use the String.replaceAll() Method to Remove Characters that Match the given REGEX Expression
            current = current.replaceAll("[\\;, \\?, \\., \\!, \\,, 0-9]", "");


            // Step 7: Compare String Length of current & longestWord to Keep Track of the Longest Word Found
            if(current.length() > longestWord.length()) {
                longestWord = current;
            }
        }

        // Step 8: Return the Longest Word
        return longestWord;
    }

    public static void main(String[] args) {
        String str_1 = "an3d; and,      and and? 43 451251251 10";

        System.out.println(longestWord(str_1));

    }
}
