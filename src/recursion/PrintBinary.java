package recursion;

/*
0 :0
1 :1
2 :10
3 :11
4 :100
5 :101
6 :110
7 :111
8 :1000
9 :1001
10:1010
 */

public class PrintBinary {

    public static void main(String[] args) {
        printBinary(10);
    }

    public static void printBinary(int n){
        if (n<2){
            System.out.print(n);
            return;
        }
        printBinary(n/2);
        printBinary(n%2);
    }

}
