package LeetCode;

public class ReverseString_8 {

    public static void printReverse_1(String s, int i) {
        if(i < 0) return;

        System.out.println(s.charAt(i));
        printReverse_1(s, i - 1);
    }




    public static void printReverse_2(char[] s, int i, int j) {
        if(i == j) {
            System.out.println(s.toString());
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;


        printReverse_2(s, ++i, --j);
    }


    public static void main(String[] args) {
        String s = "hello";
        char[] t = {'h','e','l','l','o'};
        //printReverse_1(s, s.length() - 1);
        printReverse_2(t,0, t.length - 1);
    }
}
