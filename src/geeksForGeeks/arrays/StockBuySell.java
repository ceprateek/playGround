package geeksForGeeks.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockBuySell {
    void stockBuySell(int price[], int n) {
        List<Interval> solution = new ArrayList<>();
        int count = 0;
        for (int i=0; i<n-1;){
            //Find local minimum price
            while (price[i+1]<price[i] && i<n-1){
                i++;
            }
            //no further solution
            if (i==n-1)
                break;
            Interval sol = new Interval();
            sol.buy=i++;
            while (i<n && price[i]>price[i-1]){
                i++;
            }
            sol.sell=i-1;
            solution.add(sol);
            count++;
        }
        for (Interval sol : solution){
            System.out.printf("(%d %d)", sol.buy, sol.sell);
        }
        System.out.println();
    }

    @SuppressWarnings("Duplicates")
    public static void main(String args[]) {
        StockBuySell stock = new StockBuySell();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            stock.stockBuySell(a, n);
        }
    }
}

class Interval {
    int buy, sell;
}
