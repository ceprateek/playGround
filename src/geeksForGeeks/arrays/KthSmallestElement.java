package geeksForGeeks.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class KthSmallestElement {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int j = 0; j < input; j++) {
            int size = sc.nextInt();
            int inputArray[] = new int[size];
            for (int i = 0; i < size; i++) {
                inputArray[i] = sc.nextInt();

            }
            int k = sc.nextInt();
            findKthSmallest(inputArray, k);
            System.out.println();
        }
    }

    public static void findKthSmallest(int[] inputArray, int k){
        int[] kElements = new int[k];
        for (int i=0;i<k;i++){
            kElements[i] = inputArray[i];
        }
        Arrays.sort(kElements);
        for (int i=k; i<inputArray.length; i++){
            if (inputArray[i]<kElements[k-1]){
                boolean done = false;
                for (int j=k-1;j>0; j--){
                    if (kElements[j-1]>inputArray[i]){
                        kElements[j] = kElements[j-1];
                    }else {
                        kElements[j]=inputArray[i];
                        done = true;
                        break;
                    }
                }
                if (!done)
                    kElements[0] = inputArray[i];
            }
        }
        System.out.printf("%d ",kElements[k-1]);
    }
}
