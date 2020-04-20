package recursion;

public class MakeChange {
    public static void main(String[] args) {
        ChangeMachine machine = new ChangeMachine();
        System.out.println(machine.makeChange(11));
    }


}


class ChangeMachine {
    int[] denominations;
    int[][] change;

    ChangeMachine() {
        denominations = new int[]{25, 10, 5, 1};
    }

    int makeChange(int value) {
        return change(value, 0);
    }

    private int change(int remainder, int index) {
        if (remainder == 0)
            return 1;
        else if (remainder < 0 || denominations.length == index)
            return 0;
        else {
            int withFirstCoin = change(remainder - denominations[index], index);
            int withoutFirstCoin = change(remainder, index + 1);
            return withFirstCoin + withoutFirstCoin;
        }
    }

}