package geeksForGeeks.arrays;

import java.util.Scanner;

public class ElementLeftSmallerRightGreater {

    public static void findElement(int[] ints){
        int n = ints.length;
        if (n<3){
            System.out.println(-1);
            return;
        }
        int[] leftMax = new int[ints.length];
        int[] rightMin = new int[ints.length];
        leftMax[0] = ints[0];
        for (int i=1;i<ints.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], ints[i]);
        }
        rightMin[ints.length-1] = ints[n-1];
        for (int i=n-2;i>=0;i--){
            rightMin[i] = Math.min(ints[i+1], ints[i]);
        }
        for (int i=1; i<n-1; i++){
            if (ints[i]>=leftMax[i] && ints[i]<=rightMin[i]){
                System.out.println(ints[i]);
                return;
            }
        }
        System.out.println(-1);
    }
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            findElement(a);
        }
    }
}
