package LeetCode;

public class ReverseWordsInAStringII {

    public static void main(String[] args) {
        char[] s = {'t','h','e',' ','s','k','y',' ','i','s',' ','o','n',' ','f','i','r','e'};
        int start = 0;
        int end = s.length - 1;
        String start_word = "";
        String end_word = "";
        String reversed = " ";

        if(s.length == 1) {
            return;
        }

        System.out.println("original length: " + s.length);

        while(start < end) {

            if(Character.isLetterOrDigit(s[start])) {
                start_word +=  Character.toString(s[start]);
                ++start;
            } else if(Character.isSpaceChar(s[start])) {
                if(Character.isSpaceChar(reversed.charAt(reversed.length() - 1))) {
                    reversed += start_word;
                } else {
                    reversed += " " + start_word;
                }
                start_word = "";
                ++start;
            }

            if(Character.isLetterOrDigit(s[end])) {
                end_word = Character.toString(s[end]) + end_word;
                --end;
            } else if(Character.isSpaceChar(s[end])) {
                if(Character.isSpaceChar(reversed.charAt(0))) {
                    reversed = end_word + reversed;
                } else {
                    reversed = end_word + " " + reversed;
                }
                end_word = "";
                --end;
            }
        }
        System.out.println(reversed);
        System.out.println("Reversed Length: " + reversed.length());

    }
}
