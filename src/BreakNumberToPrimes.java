import java.util.ArrayList;

/**
 * Created by prategar on 4/30/17.
 */
public class BreakNumberToPrimes {
    public static void main(String args[]){
        int i = 34;
        ArrayList<Integer> result = new ArrayList<>();
        int[] primeNumbers = {2, 3, 5, 7, 9, 13, 17, 19, 23, 29};
        for (int primeNumber : primeNumbers){
            if(i%primeNumber == 0){
                result.add(primeNumber);
            }
        }

    }
}
