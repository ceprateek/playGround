package recursion;

public class Powerab {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myPow(2, 4));
    }
}

/**
 * 2*2
 */
class Solution {
    public double fastPow(double x, int n) {
        if (n == 0)
            return 1;
        double h = myPow(x, n / 2);
        if (n % 2 == 0) {
            return h * h;
        } else
            return h * h * x;

    }

    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        return fastPow(x, n);
    }
}