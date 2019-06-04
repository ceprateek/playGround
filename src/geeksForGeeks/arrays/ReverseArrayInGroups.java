package geeksForGeeks.arrays;

import java.util.Scanner;

public class ReverseArrayInGroups {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int j = 0; j < input; j++) {
            int size = sc.nextInt();
            int groupSize = sc.nextInt();
            int inputArray[] = new int[size];
            for (int i = 0; i < size; i++) {
                inputArray[i] = sc.nextInt();
            }
            reverseInGroups(inputArray, size, groupSize);
            System.out.println();
        }
    }

    @SuppressWarnings("Duplicates")
    public static void reverseInGroups(int[] inputArray, int size, int groupSize){
        for (int i=0;i<size; i+=groupSize){
            int startIndex = i;
            int endIndex = (i+groupSize>=size)?size-1:i+groupSize-1;
            while (startIndex<endIndex){
                int temp = inputArray[startIndex];
                inputArray[startIndex] = inputArray[endIndex];
                inputArray[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
        }
        for (int i : inputArray){
            System.out.printf("%d ",i);
        }
    }
}
