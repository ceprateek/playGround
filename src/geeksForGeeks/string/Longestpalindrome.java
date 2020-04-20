package geeksForGeeks.string;

import java.util.Scanner;

public class Longestpalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            String input = sc.next();
            System.out.println(longestPalindrome(input));
        }
    }

    @SuppressWarnings("Duplicates")
    public static String longestPalindrome(String in) {
        int maxLen = 0;
        int start = 0;
        if (in.length() == 0)
            return "";
        if (in.length() == 1)
            return String.valueOf(in.charAt(0));
        for (int i = 1; i < in.length(); i++) {
            //consider even palindromes
            int low = i - 1;
            int high = i;
            while (low >= 0 && high < in.length() && in.charAt(low) == in.charAt(high)) {
                int currentLengthOfpalindrome = high - low + 1;
                if (currentLengthOfpalindrome > maxLen) {
                    maxLen = currentLengthOfpalindrome;
                    start = low;
                }
                low--;
                high++;
            }

            //consider odd palindromes
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < in.length() && in.charAt(low) == in.charAt(high)) {
                int currentLengthOfpalindrome =  high -low + 1;
                if (currentLengthOfpalindrome > maxLen) {
                    maxLen = currentLengthOfpalindrome;
                    start = low;
                }
                low--;
                high++;
            }
        }
        if (maxLen > 0) {
            return in.substring(start, start+maxLen);
        }else
            return String.valueOf(in.charAt(0));
    }
}
