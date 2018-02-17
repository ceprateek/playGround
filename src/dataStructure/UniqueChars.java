package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class UniqueChars {
    public static void main(String[] args) {
        String sampleString = "abcvgty";
        System.out.println(isUnique(sampleString));
        System.out.println(reverseString("prateek"));
    }

    private static boolean isUnique(String input){
        List<Character> simpleBuffer = new ArrayList<>();
        for (Character c : input.toCharArray()){
            if (simpleBuffer.contains(c))
                return false;
            else
                simpleBuffer.add(c);
        }
        return true;
    }

    private static String reverseString(String input){
        int j=input.length()-1;
        char[] inputChars = input.toCharArray();
        for (int i=0;i<input.length()/2;i++){
            char buffer = inputChars[i];
            inputChars[i] = inputChars[j];
            inputChars[j] = buffer;
            j--;
        }
        return new String(inputChars);
    }
}
