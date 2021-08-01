package bitwise;

public class Learn {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        printBinary(a);
        printBinary(b);
        printBinary(a|b);
        System.out.println(a|b);
    }

    public static void printBinary(int input){
        while (input>0) {
            System.out.printf("" + input%2);
            input = input/2;
        }
        System.out.println();
    }
}
