package geeksForGeeks.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
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
            int s = sc.nextInt();
            System.out.println(distribute(a, s));
        }
    }

    public static int distribute(int[] packets, int students){
        int[] studentsChocolates = new int[students];
        Arrays.sort(packets);
        for (int i=0; i<packets.length; i++){
            studentsChocolates[i%students] += packets[i];
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i=0; i<students; i++){
            min=Math.min(studentsChocolates[i],min);
            max=Math.max(studentsChocolates[i],max);
        }
        return max-min;
    }
}
