package recursion;

import java.util.ArrayList;
import java.util.List;


class LongestCommonSubstring {
    public String longestCommonSubstring(String[] strs) {
        return "";
    }

    public int longestCommonSubstring(char s1[], char s2[], int i, int j, boolean isEqual) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (isEqual) {
            if (s1[i] == s2[j]) {
                return 1 + longestCommonSubstring(s1, s2, i - 1, j - 1, true);
            } else {
                return 0;
            }
        }
        int runner = 0;
        if (s1[i] == s2[j]) {
            runner = 1 + longestCommonSubstring(s1, s2, i - 1, j - 1, true);
        }
        return Math.max(runner, Math.max(longestCommonSubstring(s1, s2, i - 1, j, false), longestCommonSubstring(s1, s2, i, j - 1, false)));
    }

    public List<String> allSubstrings(String s) {
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                strs.add(s.substring(i, j));
            }
        }
        return strs;
    }
}

class Test {
    public static void main(String[] args) {
        LongestCommonSubstring s = new LongestCommonSubstring();
        char str1[] = "abcdef".toCharArray();
        char str2[] = "zcdemf".toCharArray();
        System.out.println(s.longestCommonSubstring(str1, str2, str1.length - 1, str2.length - 1, false));
    }
}