package LeetCode;

public class LengthOfLastWord_1 {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "hi my name is Mike     ";
        System.out.println(lengthOfLastWord(s));
    }
}
