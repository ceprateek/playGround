package recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {

    public static void main(String[] args) {
        DiceRoll dr = new DiceRoll();
        System.out.println(dr.diceRoll(3));
        dr.diceRollSum(3, 9);
    }

    public List<List<Integer>> diceRoll(int dices){
        List<List<Integer>> result = new ArrayList<>();
        diceRoll(3, new ArrayList<Integer>(), result);
        return result;
    }

    public void diceRoll(int dices, List temp, List<List<Integer>> result){
        if (dices==0){
            List<Integer> onePermutation = new ArrayList<>(temp);
            result.add(onePermutation);
        }else {
            for (Integer i=1; i<=6; i++){
                temp.add(i);
                diceRoll(dices-1, temp, result);

                temp.remove(temp.size()-1);

            }
        }
    }

    public void diceRollSum(int dices, int sum){
        List<Integer> temp = new ArrayList<>();
        diceRollHelper(dices, temp, 0, sum);
    }

    public void diceRollHelper(int dices, List<Integer> temp, int tempSum, int sum){
        if (dices==0){
            if (tempSum==sum)
            System.out.println(temp);
        }else {
            for (int i=1; i<6; i++){

                temp.add(i);
                diceRollHelper(dices-1, temp, tempSum+i, sum);
                temp.remove(temp.size()-1);
            }
        }
    }

    private int sum(List<Integer> listOfIntegers){
        int sum = 0;
        for (Integer a : listOfIntegers){
            sum += a;
        }
        return sum;
    }
}
