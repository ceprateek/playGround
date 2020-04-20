package geeksForGeeks.arrays;

/*
Given two sorted arrays P[] and Q[] in non-decreasing order with size X and Y. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((X+Y) log(X+Y)). DO NOT use extra space.

Input:
First line contains an integer T, denoting the number of test cases. First line of each test case contains two space separated integers X and Y, denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers, denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.

Constraints:
1 <= T <= 100
1 <= X, Y <= 5*104
0 <= Pi, Qi <= 109

Example:
Input:
1
4 5
1 3 5 7
0 2 6 8 9

Output:
0 1 2 3 5 6 7 8 9
 */

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;

        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                result[k] = arr1[i];
                i++;
            }else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length){
            result[k] = arr1[i];
            k++;i++;
        }
        while (j<arr2.length){
            result[k] = arr2[j];
            k++;j++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();

            }
            System.out.println(Arrays.toString(merge(a,b)));
        }
    }
}
