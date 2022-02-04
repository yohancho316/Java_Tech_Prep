package LeetCode;

public class RomanToInteger_2 {

    public static int romanToInt(String s) {

        // Local Declarations
        int sum = 0;
        int length = s.length() - 1;

        // Iterate through the String
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            System.out.println("current character position: " + i);
            switch(current) {
                case 'I':
                    if((i < length) && (s.charAt(i + 1) == 'V')) {
                        sum += 4;
                        i += 1;
                        break;
                    } else if((i < length) && (s.charAt(i + 1) == 'X')) {
                        sum += 9;
                        i += 1;
                        break;
                    } else {
                        sum += 1;
                    }
                    break;

                case 'V':
                    sum += 5;
                    break;

                case 'X':
                    if((i < length) && (s.charAt(i + 1) == 'L')) {
                        sum += 40;
                        i += 1;
                        break;
                    } else if((i < length) && (s.charAt(i + 1) == 'C')) {
                        sum += 90;
                        i += 1;
                        break;
                    } else {
                        sum += 10;
                    }
                    break;

                case 'L':
                    sum += 50;
                    break;

                case 'C':
                    if((i < length) && (s.charAt(i + 1) == 'D')) {
                        sum += 400;
                        i += 1;
                        break;
                    } else if((i < length) && (s.charAt(i + 1) == 'M')) {
                        sum += 900;
                        i += 1;
                        break;
                    } else {
                        sum += 100;
                    }
                    break;

                case 'D':
                    sum += 500;
                    break;

                case 'M':
                    sum += 1000;
                    break;
            }
            System.out.println("Current Sum: " + sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
    }
}
