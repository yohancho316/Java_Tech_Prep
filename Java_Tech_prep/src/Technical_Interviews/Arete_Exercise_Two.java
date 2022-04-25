package Technical_Interviews;
import java.util.HashMap;

public class Arete_Exercise_Two {

    public static int countOccurrences(String quote, String target) {

        // Step 1: Declare & Initialize Local Variables
        int wordOccurs = 0;


        // Step 2: Declare & Instantiate HashMap that Stores KVP's of Generic Type <String,Integer>
        HashMap<String, Integer> map = new HashMap<String, Integer>();


        // Step 2: Check if String Arguments are Null. Throw the NullPointerException Runtime Exception if True
        if((quote == null) || (target == null)) throw new NullPointerException("Input cannot be Null");


        // Step 3: Check if String Arguments are Empty. Throw the Illegal Argument Runtime Exception if True.
        if((quote.isEmpty()) || (target.isEmpty())) throw new IllegalArgumentException("Input cannot be an Empty String");


        // Step 4: Use the String.split() Method to Return an Array of String Elements Separated by the REGEX Delimiter
        String[] words = quote.split("\\p{Space}");


        // Step 5: Use a For-Each Loop to Iterate through String Elements in Array words
        for(String current : words)
        {

            // Step 6: Use the String.replaceAll() Method to Remove Characters that Match the given REGEX Expression & Convert to Lower Case
            current = current.replaceAll("[\\;, \\?, \\., \\!, \\,]", "").toLowerCase();


            // Step 7: If String Value of current DOES NOT exist as a Key in the HashMap, Insert the KVP into the HashMap
            if(!(map.containsKey(current)))
            {
                map.put(current, 1);
            }


            // Step 8: Else if the String Value Exists as a Key in the HashMap, Update the Count Associated at the Key
            else
            {
                map.put(current, map.get(current) + 1);
            }
        }


        // Step 6: Check if the Target Value Exists as a Key in the HashMap
        if(map.containsKey(target.toLowerCase()))
        {
            return map.get(target.toLowerCase());
        }


        // Step 7: Return the Number of Times Target Occurs in the Given Quote
        return wordOccurs;
    }

    public static void main(String[] args) {

        String quote = "Always do your best. Your? best is going to change from moment to moment; it will be different when you are healthy as opposed to sick. Under any circumstance, simply do your best, and you will avoid self-judgment, self-abuse and regret.";
        System.out.println(countOccurrences(quote, "best"));

    }
}
