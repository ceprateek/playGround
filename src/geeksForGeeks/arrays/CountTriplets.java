package geeksForGeeks.arrays;

/*
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
5
1 2 3 5
3
2 3 7
Output:
2
-1

Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
 */

import java.util.Arrays;
import java.util.Scanner;

public class CountTriplets {
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
            System.out.println(countTriplets(a));
        }
    }

    public static int countTriplets(int[] input) {
        Arrays.sort(input);
        int tripletsFound =0;
        for (int i=input.length-1; i>1; i--) {
            int right = i-1,left=0;
            while (left < right) {
                int currentSum = input[left] + input[right];
                if (currentSum == input[i]) {
                    tripletsFound++;
                    left++;
                    right--;
                } else if (currentSum<input[i]){
                    left++;
                }else {
                    right--;
                }

            }
        }
        if (tripletsFound>0)
            return tripletsFound;
        else
            return -1;
    }
}
