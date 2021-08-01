package geeksForGeeks.arrays;

/*
Given a number in an array form. Write a program to move all zeros to the end.
Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

Input : arr[]  = {0, 0, 1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0, 0, 0};
 */

public class MoveAllZerosInEnd {
    public static void main(String[] args) {
        int[] input = {1,2,0,4,3,0,5,0};
        int replacer = 0;
        int worker = 0;
        while (worker<input.length){
            if (input[worker] != 0){
                input[replacer] = input[worker];
                replacer++;
            }
             worker++;
        }
        while (replacer<input.length){
            input[replacer] = 0;
            replacer++;
        }
        System.out.printf("{");
        for (int i=0; i<input.length; i++){
            System.out.printf("" + input[i] + " ,");
        }
        System.out.printf("}");
    }
}

