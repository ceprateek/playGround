package string;

import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "Pratek ";
        System.out.println(areAllCharsUnique(input));
    }

    public static boolean areAllCharsUnique(String input){
        HashMap<Character, Boolean> charCount = new HashMap<>();
        for (char c : input.toCharArray()){
            if(charCount.containsKey(c)){
                return false;
            }
            charCount.put(c, true);
        }
        return true;
    }
}
