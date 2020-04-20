package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumberArray {
    public static void formLargestNumber(String[] inputArray){
        Arrays.sort(inputArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String xy = o1 + o2;
                String yx = o2 + o1;

                return Integer.parseInt(yx)-Integer.parseInt(xy);
            }
        });
        for (String s : inputArray)
            System.out.print(s);
        System.out.println();
    }


    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int n = sc.nextInt();
                String a[] = new String[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.next();

                }
                formLargestNumber(a);
        }
    }
}
