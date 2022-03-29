package CodeWars;

public class SimplePigLatin_3 {

    public static String pigIt(String str) {
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 1 && !Character.isLetterOrDigit(arr[i].charAt(0))) {
                continue;
            } else {
                String pigLatin = arr[i].substring(1) + arr[i].substring(0, 1) + "ay";
                arr[i] = pigLatin;
            }
        }
        String str2 = "";
        for(int i = 0; i < arr.length; i++) {
            str2 += arr[i] + " ";
        }
        return str2.substring(0, str2.length() - 1);
    }

    public static void main(String[] args) {
        String str = "Hello world !";
        System.out.println(pigIt(str));
    }
}
