import java.awt.*;

public class Htree {
    /******************************************************************************
     *  Compilation:  javac Htree.java
     *  Execution:    java Htree n
     *  Dependencies: StdDraw.java
     *
     *  Plot an order n H-tree.
     *
     *  % java Htree 5
     *
     ******************************************************************************/


/*
        // plot an H, centered on (x, y) of the given side length
        public static void drawH(double x, double y, double size) {

            // compute the coordinates of the 4 tips of the H
            double x0 = x - size/2;
            double x1 = x + size/2;
            double y0 = y - size/2;
            double y1 = y + size/2;

            // draw the 3 line segments of the H
            StdDraw.line(x0, y0, x0, y1);    // left  vertical segment of the H
            StdDraw.line(x1, y0, x1, y1);    // right vertical segment of the H
            StdDraw.line(x0,  y, x1,  y);    // connect the two vertical segments of the H
        }

        // plot an order n H-tree, centered on (x, y) of the given side length
        public static void draw(int n, double x, double y, double size) {
            if (n == 0) return;
            drawH(x, y, size);

            // compute x- and y-coordinates of the 4 half-size H-trees
            double x0 = x - size/2;
            double x1 = x + size/2;
            double y0 = y - size/2;
            double y1 = y + size/2;

            // recursively draw 4 half-size H-trees of order n-1
            draw(n-1, x0, y0, size/2);    // lower left  H-tree
            draw(n-1, x0, y1, size/2);    // upper left  H-tree
            draw(n-1, x1, y0, size/2);    // lower right H-tree
            draw(n-1, x1, y1, size/2);    // upper right H-tree
        }

        // reads an integer command-line argument n and plots an order n H-tree
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);

            double x = 0.5, y = 0.5;   // center of H-tree
            double size = 0.5;         // side length of H-tree
            draw(n, x, y, size);
        }
*/
    final static double r = 0.02;
    public static void draw(int n, double size, double x, double y)
    {
        if (n == 0)  return;

//        StdOut.printf("x = %4.2f, y = %4.2f\n", x, y);
//        StdDraw.setPenRadius(r);
//        StdDraw.setPenColor(Color.BLACK);
//        StdDraw.point(x, y);
//        StdDraw.setPenRadius();


        double x0 = x - size/2;
        double x1 = x + size/2;
        double y0 = y - size/2;
        double y1 = y + size/2;

//        StdOut.printf("x0 = %4.2f, y0 = %4.2f\n", x0, y0);
//        StdOut.printf("x1 = %4.2f, y1 = %4.2f\n", x1, y1);


        StdDraw.line(x0, y0, x0, y1);
        StdDraw.line(x1, y0, x1, y1);
        StdDraw.line(x0, y, x1, y);

//        StdDraw.setPenRadius(r);
//        StdDraw.setPenColor(Color.RED);
//        StdDraw.point(x0, y0);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(Color.BLACK);
        draw(n - 1, size/2.0, x0, y0);

//        StdDraw.setPenRadius(r);
//        StdDraw.setPenColor(Color.GREEN);
//        StdDraw.point(x0, y1);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(Color.BLACK);
        draw(n - 1, size/2.0, x0, y1);

//        StdDraw.setPenRadius(r);
//        StdDraw.setPenColor(Color.BLUE);
//        StdDraw.point(x1, y0);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(Color.BLACK);
        draw(n - 1, size/2, x1, y0);

//        StdDraw.setPenRadius(r);
//        StdDraw.setPenColor(Color.YELLOW);
//        StdDraw.point(x1, y1);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(Color.BLACK);
        draw(n - 1, size/2, x1, y1);

    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
    }
}
