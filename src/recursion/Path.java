package recursion;


/**
 * Imagine a robot sitting on the upper left hand corner of an NxN grid.
 * The robot can only move in two directions: right and down.
 * How many possible paths are there for the robot?
 */
public class Path {

    public static void main(String[] args) {
        System.out.println(computePaths(5));
    }

    public static int computePaths(int n){
        return recursive(n, 1, 1);
    }

    public static int recursive(int n, int i, int j){
        if( i == n || j == n){
            //reach either border, only one path
            return 1;
        }
        return recursive(n, i + 1, j) + recursive(n, i, j + 1);
    }
}
