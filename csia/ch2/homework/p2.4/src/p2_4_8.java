import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdStats;
import percolation.Percolation;

import java.util.ArrayList;

public class p2_4_8 {
    /*look at Percolation package*/


    public static void showPercolationExperiment(int n, double p) {

        StdDraw.clear();
        boolean[][] isOpen = Percolation.random(n, p);
        StdDraw.setPenColor(StdDraw.BLACK);
        Percolation.show(isOpen, false);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        boolean[][] isFull = Percolation.flow(isOpen);
        Percolation.show(isFull, true);
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double dp = Double.parseDouble(args[1]);
        StdDraw.enableDoubleBuffering();




        ArrayList<Integer> al = new ArrayList<Integer>();

        double p = 0;
        while (p < 1) {
            showPercolationExperiment(n, p);

            al.add(Percolation.getDepth());

            //StdDraw.show();
            //StdOut.println(p);
            //StdDraw.pause(1000);

            p += dp;
        }
        showPercolationExperiment(n, 1);
        al.add(Percolation.getDepth());




        int[] a = al.stream().mapToInt(i -> i).toArray();

        StdDraw.clear();

        double p0 = 0;
        p = 0;
        int d0 = 0;
        int d = 0;

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, StdStats.max(a));


        for (int i = 0; i < a.length; i++) {

            p += dp;
            d = a[i];
            StdDraw.line(p0, d0, p, d);
            d0 = d;
            p0 = p;
        }

        StdDraw.show();
        //StdDraw.pause(1000);
    }


}
