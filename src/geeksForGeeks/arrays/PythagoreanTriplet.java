package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet {

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
            findPTriplet(inputArray);
        }
    }

    public static void findPTriplet(int[] inputArray){
        int n = inputArray.length;
        Arrays.sort(inputArray);
        for (int i=n-1; i>1;i--){
            int left=0,right=i-1;
            int numberToExamine = inputArray[i];
            int c = numberToExamine * numberToExamine;
            while (left<right){
                int a = inputArray[left];
                int b = inputArray[right];
                int sum = a*a + b*b;
                if (sum<c){
                    left++;
                }else if (sum>c){
                    right--;
                }else {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
