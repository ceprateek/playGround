package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to compute all permutations of a string
 */
public class StringPermutation {

    public static void main(String[] args) {
        System.out.println(getPermutations("abc"));
    }

    public static List<String> getPermutations(String input){
        List<String> output = new ArrayList<>();
        if (input.length()==1){
            output.add(input);
            return output;
        }
        for (int i=0 ; i<input.length(); i++){
            List<String> permutations = getPermutations(getStringMinusIndex(input, i));
            for (String permutation : permutations){
                output.add(input.charAt(i) + permutation);
            }
        }
        return output;
    }

    public static String getStringMinusIndex(String input, int index){
        StringBuilder sb = new StringBuilder(input);
        sb = sb.deleteCharAt(index);
        return sb.toString();
    }
}
