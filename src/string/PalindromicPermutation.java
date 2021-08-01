package string;

//Map
//Array
//

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PalindromicPermutation {
    public static void main(String[] args) {
        String input = "abcba";
        findOccuranceOfChar(input);

    }
    public static boolean check(String input){
        int[] charCount = new int[128];

        return false;
    }
    //abcba
    // a->2, b->2, [c->1],
    public static void findOccuranceOfChar(String input){
        Map<Character, Integer> charOccuranceMap = new HashMap<>();
        char[] chars = input.toCharArray();
        for(int i=0; i<chars.length; i++){
            if (charOccuranceMap.containsKey(chars[i])){
                int existingNumber = charOccuranceMap.get(chars[i]);
                charOccuranceMap.put(chars[i], ++existingNumber);
            }else {
                charOccuranceMap.put(chars[i], 1);
            }
        }

        //ArrayList, Set, Map

        Set<Character> allKeys = charOccuranceMap.keySet();
        for(Character c : allKeys){
            System.out.println(c + ": "+ charOccuranceMap.get(c));
        }

        System.out.println("\n\niteration via entry set:\n\n");

        for (Map.Entry<Character, Integer> pair : charOccuranceMap.entrySet()){
            if (pair.getValue()>1) {
                System.out.println(pair.getKey() );
            }
        }
        for(int i=0; i<chars.length; i++){
            System.out.print(chars[i]);
        }
        System.out.println();
        for(char c : chars){
            System.out.print(c);
        }
    }


}
