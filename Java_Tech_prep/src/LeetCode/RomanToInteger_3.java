package LeetCode;

public class RomanToInteger_3 {

    public static int romanToInt(String s) {

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'V') sum += 5;
            else if(s.charAt(i) == 'L') sum += 50;
            else if(s.charAt(i) == 'D') sum += 500;
            else if(s.charAt(i) == 'M') sum += 1000;
            else if(s.charAt(i) == 'I') {
                if(i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    sum += 4;
                    ++i;
                } else if(i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    sum += 9;
                    ++i;
                } else {
                    sum += 1;
                }
            } else if(s.charAt(i) == 'X') {
                if(i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    sum += 40;
                    ++i;
                } else if(i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    sum += 90;
                    ++i;
                } else {
                    sum += 10;
                }
            } else if(s.charAt(i) == 'C') {
                if(i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    sum += 400;
                    ++i;
                } else if(i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    sum += 900;
                    ++i;
                } else {
                    sum += 100;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
    }
}