package interviews;

import java.util.ArrayList;
import java.util.List;

public class MandeepSandhu {

    public static void main(String[] args) {
        MandeepSandhu dr = new MandeepSandhu();
        dr.diceSum(3,6);
        //[1,1,4] [1,2,3] [1,3,2] [1,4,1][4,1,1]...
    }

    List<List<Integer>> res;
    public void diceSum(int numDice, int desiredSum){
        res = new ArrayList<List<Integer>>();
        for ( int i = 1; i < (6 - numDice + 1); i++) {
            int newSum = desiredSum - i;
            newDiceSum(numDice - 1, newSum, res);
        }
    }

    public void newDiceSum(int numDice, int desriredSum, List<List<Integer>> res) {
        if ( numDice == 1 && (desriredSum < 7 && desriredSum > 0)) {
            // found number for this dice
            List<Integer> res1 = new ArrayList<Integer>();
            res1.add(desriredSum);
            return;
        }
        for ( int i = 1; i < (6 - numDice + 1); i++) {
            int newSum = desriredSum - i;
            newDiceSum(numDice - 1, newSum, res);
        }
    }
}

//D1: 1..6
//        D2+D3: 5,4,3,2,1
//        for 5:
//        D2: 4,3,2,1
//        D3: 1,2,3,4
//        for 4:
//        D2: 3,2,1
//        D3: 1,2,3
//
//        1,4,1; 1