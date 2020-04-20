package geeksForGeeks.arrays;

import java.util.Scanner;

public class LeadersArray {
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
            findLeadersRight(inputArray);
        }
    }

    public static void findLeadersRight(int[] inputArray){
        int n = inputArray.length;
        int max =inputArray[n-1];
        System.out.printf("%d ",max);
        for (int i=n-2;i>=0;i--){
            if (inputArray[i]>=max){
                max = inputArray[i];
                System.out.printf("%d ",max);
            }
        }
        System.out.println();
    }
}
