package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int j = 0; j < input; j++) {
            int size = sc.nextInt();
            int inputArray[] = new int[size];
            for (int i = 0; i < size; i++) {
                inputArray[i] = sc.nextInt();

            }
            rearrange(inputArray);
            for(int i =0;i<inputArray.length-1; i++){
                System.out.printf("%d ",inputArray[i]);
            }
            System.out.print(inputArray[inputArray.length-1]);
            System.out.println();
        }
    }

    public static void rearrange(int[] inputArray){
        int n = inputArray.length;
        int temp[] = new int[n];
        int small=0, large=n-1;
        boolean flag = true;
        for (int i=0; i<n; i++)
        {
            if (flag)
                temp[i] = inputArray[large--];
            else
                temp[i] = inputArray[small++];

            flag = !flag;
        }
        for (int i=0;i<n;i++){
            inputArray[i] = temp[i];
        }
    }
}
