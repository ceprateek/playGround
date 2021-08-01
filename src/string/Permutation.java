package string;

import java.util.HashMap;
import java.util.Map;

public class Permutation {
    public static void main(String[] args) {

    }
    public static boolean areStringPermutations(String input1, String input2){
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c:input1.toCharArray()){
            if (charCount.containsKey(c)){
                int count = charCount.get(c);
                count++;
                charCount.put(c, count);
            }else {
                charCount.put(c, 1);
            }
        }
        for (char c: input2.toCharArray()){
            if(!charCount.containsKey(c)){
                return false;
            }
            int count = charCount.get(c);
            int newCount = count--;
            if (newCount<0){
                return false;
            }
            charCount.put(c, newCount);
        }
        for (Map.Entry<Character, Integer> entry: charCount.entrySet()){
            if (entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
