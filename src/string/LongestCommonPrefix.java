package string;



//{“a”,“a”,“b”} should give “” as there is nothing common in all the 3 strings.
//
//        {“a”, “a”} should give “a” as a is longest common prefix in all the strings.
//
//        {“abca”, “abc”} as abc
//
//        {“ac”, “ac”, “a”, “a”} as a.
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++){
            prefix = longestPrefix(prefix, strs[i]);
        }
        return prefix;
    }

    public String longestPrefix(String s1, String s2){
        int i = 0,j=0;
        StringBuilder prefix = new StringBuilder();
        while (i<s1.length() && j<s2.length()){
            if (s1.charAt(i) == s2.charAt(j)){
                prefix = prefix.append(s1.charAt(i));
                i++;
                j++;
            }else {
                return prefix.toString();
            }

        }
        return prefix.toString();
    }
}

class Test {
    public static void main(String[] args) {
        LongestCommonPrefix s = new LongestCommonPrefix();
        String[] strs = {"asfprateek", "asfgrprateel", "asprateek"};
        System.out.println(s.longestCommonPrefix(strs));

    }
}