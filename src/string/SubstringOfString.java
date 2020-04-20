package string;

/**
 * Created by prategar on 5/3/17.
 */
public class SubstringOfString {
    public static void main(String args[]){
        String a = "Praeteek1";
        String b = "eek";
        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();
        System.out.println(a.contains(b));
    }

    public static boolean checkSubstring(char[] source, char[] target){
        char first = target[0];
        for (int i=0; i<source.length; i++){
            while(first != source[i])
                i++;
            if (i>=source.length)
                return false;
            //found first char


        }
        return false;
    }
}
