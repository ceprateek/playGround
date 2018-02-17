package mics;

/**
 * Created by prategar on 9/5/17.
 */
public class Swap {
    public static void main(String[] args) {
        int a = 8;
        int b = 100;
        a = a+b;
        b= a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}
