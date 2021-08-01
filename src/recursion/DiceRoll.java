package recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {

    static int counter;

    public static void main(String[] args) {
        DiceRoll dr = new DiceRoll();
//        dr.dicePermutate(3);
//        System.out.printf("counter : %s%n",counter);

        dr.diceSum(3,6);
        System.out.println(counter);
    }

    public void dicePermutate(int n){
        //print all possible permutations where n is number of dices
        dicePermutateHelper(n,new ArrayList<>());
    }

    private void dicePermutateHelper(int n, List<Integer> chosen){
        if (n==0){
            System.out.println(chosen);
            counter++;
            return;
        }
        for (int i=1;i<=6;i++){
            chosen.add(i);
            dicePermutateHelper(n-1,chosen);
            chosen.remove(chosen.size()-1);
        }
    }

    public void diceSum(int n, int sum){
        //print all possible combinations which sum to sum
        //e.g. 3,6 [1,1,4] [1,2,3] [1,3,2] [1,4,1]
        diceSumHelper(3,6, 0, new ArrayList<>());
    }

    private void diceSumHelper(int n, int sum, int sumSoFar, List<Integer> chosen){
        if (n==0){
            counter++;
            if (sum==sumSoFar){
                System.out.println(chosen);
            }
            return;
        }else if ((sumSoFar + 1*n) <= sum && (sumSoFar + 6*n)>=sum) {
            for (int i = 1; i <= 6; i++) {
                chosen.add(i);
                diceSumHelper(n - 1, sum, sumSoFar+i, chosen);
                chosen.remove(chosen.size() - 1);
            }
        }
    }

}