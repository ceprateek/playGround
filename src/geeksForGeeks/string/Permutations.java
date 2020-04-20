package geeksForGeeks.string;

import java.util.Scanner;

public class Permutations {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        permutate("abc");

    }

    public static void permutate(String s){
        StringBuilder chosen = new StringBuilder();
        permutateHelper(s, chosen);
    }

    public static void permutateHelper(String input, StringBuilder chosen){
        if (input.length()==0){
            System.out.printf(chosen.toString() + " ");
        }else {
            for (int i=0; i<input.length(); i++) {
                char charChosen = input.charAt(i);
                chosen.append(charChosen);
                StringBuilder input1 = new StringBuilder(input);
                input1.deleteCharAt(i);

                permutateHelper(input1.toString(),chosen);

                chosen.deleteCharAt(chosen.length()-1);

            }
        }
    }
}
