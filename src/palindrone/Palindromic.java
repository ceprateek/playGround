package palindrone;

public class Palindromic {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("babad"));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String out = "";
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                if (isPalindrone(s, i , j) && maxLength<j-i){
                    maxLength = j - i;
                    out = s.substring(i, j+1);
                }
            }
        }
        return out;
    }

    public boolean isPalindrone(String s, int start, int end){
        for (int i=start,j=end; i<=j; i++,j--){
            if (s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}