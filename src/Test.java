import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Test {

    public static void main(String args[]) throws NoSuchAlgorithmException
    {
        String[] strs = {"prateek", "garg", "deepti", "singhal", "nitara"};
        for (String str : strs){
            System.out.println(str);
        }

        String[] newStrs = new String[strs.length];
        for (String str : strs){
            if (str.equals("prateek")){
                newStrs[strs.length-1] = str;
            }
        }
        for (String str : newStrs){
            System.out.println(str);
            System.out.println(str.getClass().getName());
        }
    }
} 