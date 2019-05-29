package geeksForGeeks.arrays;

import java.util.*;
import java.lang.*;
import java.io.*;
/*
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines.
The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N
space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring
subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
 */

public class SubarrayGivenSum {
    public static void subArraySum(int arr[], int n, int sum) {
        int currentSum = arr[0];
        int start = 0;
        for (int j = 1; j < n; j++) {
            while (currentSum > sum && start < j) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == sum) {
                System.out.printf("%d %d\n", start+1, j);
                return;
            }
            currentSum += arr[j];
        }
        while (start<n && currentSum>sum){
            currentSum-=arr[start];
            start++;
            if (currentSum==sum){
                System.out.printf("%d %d\n", start+1, n);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            subArraySum(a,n,sum);
        }
    }
}
