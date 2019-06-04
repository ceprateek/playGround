package geeksForGeeks.arrays;

import java.util.Scanner;

public class SpiralMatrix {
    @SuppressWarnings("Duplicates")
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int a[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j=0; j<n; j++) {

                    a[i][j] = sc.nextInt();

                }
            }
            //spriralTraverse(a, m, n);
            spiralPrint(m,n,a);
        }
    }

    public static void spriralTraverse(int[][] ints, int rows, int cols){
        int r=0,c=0;
        while (r<rows && c<cols){
            for (int i=r; i<cols; i++){
                System.out.printf("%d ", ints[r][i]);
            }
            r++;

            for (int i=r; i<rows; i++){
                System.out.printf("%d ", ints[i][cols-1]);
            }
            cols--;
            for (int i=rows-1; i>=c; i--){
                System.out.printf("%d ", ints[rows-1][i]);
            }
            rows--;
            for (int i=cols-1; i>=r;i--){
                System.out.printf("%d ", ints[i][c]);
            }
            c++;
        }
    }

    static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */

        while (k < m && l < n)
        {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < m; ++i)
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;

            // Print the last row from the remaining rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }
        }
    }

}
