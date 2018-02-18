package recursion;

public class Fibnocci {
    public static void main(String[] args) {
        int a = fib(10);
        System.out.println(a);
    }

    private static int fib(int data){
        if (data==1)
            return 1;
        else if (data==0)
            return 0;
        else if (data>1)
            return fib(data-1) + fib(data-2);
        else
            return -1;
    }
}