package recursion;

import java.util.ArrayList;

/**
 * Created by prategar on 5/16/17.
 */
public class StringPermutation {
    public static void main(String[] args) {
        String input = "prateek";
        ArrayList<String> output = new ArrayList<>();
        getPermutations("", input, output);
        System.out.println(output);
        System.out.println(output.size());
    }

    public static void getPermutations(String prefix, String str, ArrayList<String> output) {
        int n = str.length();
        if (n == 0) {
            output.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                getPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), output);
        }
    }

}
