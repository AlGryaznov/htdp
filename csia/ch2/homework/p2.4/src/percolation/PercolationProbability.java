package percolation;

import edu.princeton.cs.algs4.StdOut;

public class PercolationProbability {

    public static double estimate(int n , double p, int trials) {
        int count= 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] isOpen = Percolation.random(n, p);
            if (Percolation.percolates(isOpen)) count++;
        }
        return (double) count / trials;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        int trials = Integer.parseInt(args[2]);

        double q = estimate(n, p, trials);
        StdOut.println(q);
    }
}
