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
4
1 5 3 2
3
3 2 7
Output:
2
-1

Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
 */

import java.util.Arrays;
import java.util.Scanner;

public class CountTriplets {
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

    public static int countTriplets(int[] input){
        int result = -1;
        if (input.length<3)
            return -1;
        Arrays.sort(input);
        for (int j=input.length-1;j>1;j--){
            int l=0,r=j-1;
            while (l<r){
                int currentSum = input[l] + input[r];
                if (currentSum==input[j]){
                    if (result<0)
                        result=0;
                    result++;
                    System.out.printf("%d %d %d\n",input[l],input[r],input[j]);
                    l++;r--;
                }else if (currentSum<input[j]){
                    l++;
                }else {
                    r--;
                }
            }
        }

        return result;
    }
}
