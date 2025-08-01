package percolation;

import edu.princeton.cs.algs4.StdDraw;

public class PercolationVisualizer {
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        StdDraw.enableDoubleBuffering();

        //boolean[][] isOpen = StdArrayIO.readBoolean2D();
        boolean[][] isOpen = Percolation.random(n, p);
        StdDraw.setPenColor(StdDraw.BLACK);
        Percolation.show(isOpen, false);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        boolean[][] isFull = Percolation.flow(isOpen);
        Percolation.show(isFull, true);
        StdDraw.show();
    }
}
