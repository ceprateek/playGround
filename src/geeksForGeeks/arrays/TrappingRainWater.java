package geeksForGeeks.arrays;

import java.util.Scanner;

public class TrappingRainWater {

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
            trapRainWater(inputArray);
            System.out.println();
        }
    }

    public static void trapRainWater(int[] inputArray){
        int water = 0;
        for (int i=1;i<inputArray.length-1;i++){
            int lmax=0,rmax=0;
            for (int l=i-1;l>=0;l--){
                lmax = Math.max(lmax, inputArray[l]);
            }
            for (int r=i+1;r<inputArray.length;r++){
                rmax = Math.max(rmax, inputArray[r]);
            }
            int currentWater = Math.min(lmax,rmax) - inputArray[i];
            water = (currentWater>0)?water+currentWater:water;
        }
        System.out.print(water);
    }
}
