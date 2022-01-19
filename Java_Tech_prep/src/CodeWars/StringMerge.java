package CodeWars;

public class StringMerge {

    public static String stringMerge(String s1, String s2, char letter) {

        // Local Declarations
        int s1_index = s1.indexOf(letter);
        int s2_index = s2.indexOf(letter);

        return s1.substring(0,s1_index) + letter + s2.substring(++s2_index);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(stringMerge(s1,s2, 'l'));
    }
}
