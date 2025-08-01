import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class p_2_3_30NS {

    public static void curve(double x0, double y0,
                             double x1, double y1,
                             double var, double s)
    {
        if ((x1 - x0 < 0.005) && (y1 - y0 < 0.005))
        {
            StdDraw.line(x0, y0, x1, y1);
            return;
        }

        double xm = (x0 + x1) / 2;
        double ym = (y0 + y1) / 2;
        double delta = StdRandom.gaussian(0, Math.sqrt(var));

        curve(x0, y0, xm + delta, ym + delta, var / s, s);
        curve(xm + delta, ym + delta, x1, y1, var / s, s);
    }

    public static void solution(double hurst)
    {
        double s = Math.pow(2, 2 * hurst);
        double[][] points = {
                {2, 24, 7, 24},
                {7, 21, 7, 24},
                {7, 21, 10, 21},
                {10,18, 10, 21},
                {9, 18, 10, 18},
                {9, 15, 9, 18},
                {9, 15, 12, 15},
                {12, 8, 12, 15},
                {12, 8, 15, 8},
                {15, 8, 16, 5},
                {13, 5, 16, 5},
                {13, 3, 13, 5},
                {13, 3, 15, 3},
                {15, 1, 15, 3},
                {9, 1, 15, 1},
                {9, 0, 9, 1},
                {0, 0, 9, 0},
                {0, 0, 0, 2},
                {0, 2, 6, 2},
                {6, 2, 6, 3},
                {4, 3, 6, 3},
                {4, 3, 4, 8},
                {4, 8, 7, 8},
                {7, 8, 7, 11},
                {5, 11, 7, 11},
                {5, 11, 5, 15},
                {3, 15, 5, 15},
                {3, 15, 3, 19},
                {3, 19, 2, 24},};

        double pointScale = 0.05;

        StdDraw.setXscale(-0.2, 1.5);
        StdDraw.setYscale(-0.2, 1.5);
        StdDraw.enableDoubleBuffering();

        for (int i = 0; i < points.length; i++) {
            curve(points[i][0] * pointScale,
                    points[i][1] * pointScale,
                    points[i][2] * pointScale,
                    points[i][3] * pointScale,
                    0.0003, s);
        }
        StdDraw.show();
    }


    public static void main(String[] args) {
        double hurst = Double.parseDouble(args[0]);
        double n = Double.parseDouble(args[1]);
    }
}
