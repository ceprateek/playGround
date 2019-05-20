package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a method that returns all subsets of a set.
 */
public class SubsetsOfSet {
    public static void main(String[] args) {
        Solutionp s = new Solutionp();
        s.printStars(5);
    }

}

class Solutionp{
    public void printStars(int n){
        if (n==1){
            System.out.print("*");
        }else {
            System.out.print("*");
            printStars(n-1);
        }
    }
}