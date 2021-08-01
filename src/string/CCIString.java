package string;

public class CCIString {
    public boolean isUnique(String in){
        System.out.println("Checking if string is unique");
        char[] chars = in.toCharArray();
        boolean[] isPresent = new boolean[256];

        for (char c : chars){
            if (isPresent[c]){
                return false;
            }
            isPresent[c] = true;
        }
        return true;
    }

    public boolean isPalindrome(String in){
        System.out.println("Checking if string is palindrome");
        char[] chars = in.toCharArray();
        for (int i=0,j=chars.length-1; i<j; i++,j--){
            if (chars[i]!= chars[j]){
                return false;
            }
        }
        return true;
    }
    /*Given a string, determine if a permutation of the string could form a palindrome.
    Example 1:
    Input: "code" false
    Example 2:
    Input: "aab" true
    Example 3:
    Input: "carerac" true
     */
    public boolean canPermutePalindrome(String s) {
        int[] charFrequency = new int[128];
        char[] chars = s.toCharArray();

        for (char c : chars){
            charFrequency[c]++;
        }
        boolean oddpresent = false;
        for (int i=0; i<128; i++){
            if (charFrequency[i]%2!=0){
                if (oddpresent) {
                    return false;
                }
                oddpresent=true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CCIString uc = new CCIString();
        System.out.println(uc.isUnique("Pratek"));
        System.out.println(uc.isUnique("Prateek"));

        System.out.println(uc.isPalindrome("abcba"));
        System.out.println(uc.isPalindrome("abcbaa"));

    }

}
