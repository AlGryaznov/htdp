package percolation;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Percolation {

    private static int depth = 0;

    public static boolean[][] flow(boolean[][] isOpen) {


        return flowRecursive(isOpen);
    }

    public static int getDepth() {
        return depth;
    }

    public static boolean[][] flowRecursive(boolean[][] isOpen) {

        int n = isOpen.length;
        boolean[][] isFull = new boolean[n][n];
        depth = 0;

        for (int j = 0; j < n; j++) {
            flowRecursive(isOpen, isFull, 0, j, 0);
        }

        StdOut.println("recursion depth = " + depth);
        return isFull;
    }

    public static void flowRecursive(
            boolean[][] isOpen,
            boolean[][] isFull, int i, int j, int c) {

        c++;
        if (c > depth) depth = c;


        int n = isFull.length;
        if (i < 0 || j >= n) return;
        if (j < 0 || i >= n) return;

        if (!isOpen[i][j]) return;
        if (isFull[i][j]) return;

        isFull[i][j] = true;

        flowRecursive(isOpen, isFull, i+1, j, c);
        flowRecursive(isOpen, isFull, i, j+1, c);
        flowRecursive(isOpen, isFull, i, j-1, c);
        flowRecursive(isOpen, isFull, i-1, j, c);
/*
        flowRecursive(isOpen, isFull, i-1, j, c);
        flowRecursive(isOpen, isFull, i, j-1, c);
        flowRecursive(isOpen, isFull, i, j+1, c);
        flowRecursive(isOpen, isFull, i+1, j, c);
*/
    }

    public static boolean[][] flowVertical(boolean[][] isOpen) {

        int n = isOpen.length;
        boolean[][] isFull = new boolean[n][n];

        for (int j = 0; j < n; j++) {

            isFull[0][j] = isOpen[0][j];
        }

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < n; j++) {

                isFull[i][j] = isOpen[i][j] && isFull[i - 1][j];
            }
        }

        return isFull;
    }

    public static boolean percolates(boolean[][] isOpen) {

        boolean[][] isFull = flow(isOpen);
        int n = isOpen.length;
        boolean result = false;

        for (int i = 0; i < n; i++) {
            if (isFull[n-1][i]) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void show(boolean[][] a, boolean which)
    {
        int n = a.length;
        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(-1, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (a[i][j] == which) {
                    Color c = StdDraw.getPenColor();
                    StdDraw.setPenColor(Color.WHITE);
                    StdDraw.filledSquare(j, n-i-1, 0.5);
                    StdDraw.setPenColor(c);
                    StdDraw.filledSquare(j, n-i-1, 0.48);
                }
                //StdDraw.pause(100);
            }
        }
    }

    public static boolean[][] random(int n, double p) {

        boolean[][] a = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = StdRandom.bernoulli(p);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        /*
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        boolean[][] isOpen = random(n, p);//StdArrayIO.readBoolean2D();
        StdArrayIO.print(flow(isOpen));
        show(flow(isOpen), false);
        StdOut.println(percolates(isOpen));
        */
    }
}
