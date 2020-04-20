package geeksForGeeks.string;

import java.util.Scanner;

public class RecursivelyRemoveAllAdjacentDuplicates {

    public static void removeDups(String s){
        if (s.length()==0){
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder(s);
        StringBuilder temp = new StringBuilder();
        System.out.println(removeDupsHelper(s, '\0'));
    }
    public static String removeDupsHelper(String str, char last_removed){
        if (str.length()<=1)
            return str;
        if (str.charAt(0)==str.charAt(1)){
            last_removed = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1))
                str = str.substring(1);
            str = str.substring(1);
            removeDupsHelper(str, last_removed);
        }
        //First is different from second
        String rem_str = removeDupsHelper(str.substring(1), last_removed);
        if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0))
        {
            last_removed = str.charAt(0);
            return rem_str.substring(1); // Remove first character
        }
        if (rem_str.length() == 0 && last_removed == str.charAt(0))
            return rem_str;

        // If the two first characters of str and rem_str don't match,
        // append first character of str before the first character of
        // rem_str
        return (str.charAt(0) + rem_str);
    }

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
                String input = sc.next();
                removeDups(input);
        }
    }
}
