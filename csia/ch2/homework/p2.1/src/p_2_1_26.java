import edu.princeton.cs.algs4.StdOut;

public class p_2_1_26 {

    public static int totient(int n) {

        int count = 0;
        for (int i = 1; i < n; i++) {

            if (gcd(n, i) == 1) {
                count++;
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {

        int r = b;

        while(r != 0) {

            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        /*
        StdOut.printf("%d\n", gcd(0,9));
        StdOut.printf("%d\n", gcd(9,0));
        StdOut.printf("%d\n", gcd(1,8));
        StdOut.printf("%d\n", gcd(9,3));
        StdOut.printf("%d\n", gcd(9,5));
        StdOut.printf("%d\n", gcd(12,18));
         */

        StdOut.printf("%d\n", totient(2));
        StdOut.printf("%d\n", totient(327));
    }
}
