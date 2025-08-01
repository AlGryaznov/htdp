import edu.princeton.cs.algs4.StdOut;

public class p_2_3_29 {

    public static void collatz(int n)
    {
        StdOut.print(n + " ");
        if (n == 1) return;
        if (n % 2 == 0) collatz(n / 2);
        else            collatz(3 * n + 1);

    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        collatz(n);
    }
}
