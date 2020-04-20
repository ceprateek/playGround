package string;

import java.util.HashSet;
import java.util.Set;

/**
 * Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 */

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] input = s.toCharArray();
        if (s==null || s.length()==0){
            return 0;
        }
        HashSet<Character> temp = new HashSet<>();
        String solution = "";
        int i=0,j=0,maxLength=1;
        while (j<s.length()){
            char charToExamine = input[j];
            if (!temp.contains(charToExamine)){
                temp.add(charToExamine);
                j++;
                maxLength = Math.max(maxLength, j-i);
                solution = new String(input, i, j + 1 - i);
            }else {
                temp.remove(input[i]);
                i++;
            }
        }
        System.out.println(solution);
        return maxLength;
    }
}