package string;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input");   
        String in = s.nextLine();
        char[] charArray = in.toCharArray();
        for (int i=0;i<charArray.length;i++){
            char c = charArray[i];
            if(Character.isLowerCase(c)){
                charArray[i] = Character.toUpperCase(c);
            }
        }
        in = new String(charArray);
        System.out.println(in);
        s.close();
    }
}
