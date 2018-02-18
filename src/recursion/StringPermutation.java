package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to compute all permutations of a string
 */
public class StringPermutation {

    public static void main(String[] args) {
        List<String> all = getPermutations("prateek");
        System.out.println(all.size());
        System.out.println(all);
    }

    public static List<String> getPermutations(String originalString) {
        List<String> permutations = new ArrayList<>();

        if (originalString.length()==1){
            permutations.add(originalString);
            return permutations;
        }

        for (int i=0; i<originalString.length(); i++){
            List<String> _permutations = getPermutations(getStringWithRemovalOfCharAtIndex(originalString, i));
            for (String sub : _permutations){
                permutations.add(originalString.charAt(i) + sub);
            }
        }
        return permutations;
    }

    public static String getStringWithRemovalOfCharAtIndex(String original, int index){
        StringBuilder sb = new StringBuilder(original);
        return sb.deleteCharAt(index).toString();
    }
}
