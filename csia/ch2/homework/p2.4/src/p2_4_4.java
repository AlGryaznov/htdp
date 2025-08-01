import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import percolation.PercolationDirect;


public class p2_4_4 {

    public static void showPercolationExperiment(int n, double p) {

        StdDraw.clear();
        boolean[][] isOpen = PercolationDirect.random(n, p);
        StdDraw.setPenColor(StdDraw.BLACK);
        PercolationDirect.show(isOpen, false);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        boolean[][] isFull = PercolationDirect.flow(isOpen);
        PercolationDirect.show(isFull, true);
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double dp = Double.parseDouble(args[1]);
        StdDraw.enableDoubleBuffering();

        double p = 0;


        while (p < 1) {
            showPercolationExperiment(n, p);
            StdDraw.show();
            StdOut.println(p);
            StdDraw.pause(1000);
            p += dp;
        }
        showPercolationExperiment(n, 1);
        StdDraw.show();
        StdDraw.pause(1000);

    }
}
