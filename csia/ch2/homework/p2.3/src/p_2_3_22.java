import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;




public class p_2_3_22 {
    final static double r = 0.02;

    private static void drawSquare(double x, double y, double halfLength)
    {
        StdDraw.setPenColor();
        StdDraw.filledSquare(x, y, halfLength);
        StdDraw.setPenColor(Color.GRAY);
        StdDraw.filledSquare(x, y, halfLength - 0.01 * halfLength);
        StdDraw.setPenColor();
    }

    public static void drawFigure1(int n, double size, double x, double y)
    {
        if (n == 0)  return;

        double x0 = x - size/2;
        double x1 = x + size/2;
        double y0 = y - size/2;
        double y1 = y + size/2;

        drawFigure1(n - 1, size/2.0, x0, y0);
        drawFigure1(n - 1, size/2.0, x0, y1);
        drawFigure1(n - 1, size/2, x1, y0);
        drawFigure1(n - 1, size/2, x1, y1);

        drawSquare(x, y, size / 2);
    }

    public static void drawFigure2(int n, double size, double x, double y)
    {
        if (n == 0)  return;

        double x0 = x - size/2;
        double x1 = x + size/2;
        double y0 = y - size/2;
        double y1 = y + size/2;

        drawFigure2(n - 1, size/2.0, x0, y0);
        drawFigure2(n - 1, size/2.0, x0, y1);

        drawFigure2(n - 1, size/2, x1, y1);

        drawSquare(x, y, size / 2);
        drawFigure2(n - 1, size/2, x1, y0);
    }

    public static void drawFigure3(int n, double size, double x, double y)
    {
        if (n == 0)  return;

        double x0 = x - size/2;
        double x1 = x + size/2;
        double y0 = y - size/2;
        double y1 = y + size/2;

        drawSquare(x, y, size / 2);
        drawFigure3(n - 1, size/2.0, x0, y0);
        drawFigure3(n - 1, size/2.0, x0, y1);
        drawFigure3(n - 1, size/2.0, x1, y1);
        drawFigure3(n - 1, size/2.0, x1, y0);
    }

    public static void drawFigure4(int n, double size, double x, double y)
    {
        if (n == 0)  return;

        double x0 = x - size/2;
        double x1 = x + size/2;
        double y0 = y - size/2;
        double y1 = y + size/2;


        drawFigure4(n - 1, size/2.0, x0, y1);
        drawFigure4(n - 1, size/2, x1, y1);
        drawSquare(x, y, size / 2);
        drawFigure4(n - 1, size/2.0, x0, y0);
        drawFigure4(n - 1, size/2, x1, y0);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        //drawFigure1(n, 0.5, 0.5, 0.5);
        //StdDraw.pause(1000);
        //drawFigure2(n, 0.5, 0.5, 0.5);
        //StdDraw.pause(1000);
        //drawFigure3(n, 0.5, 0.5, 0.5);
        //StdDraw.pause(1000);
        drawFigure4(n, 0.5, 0.5, 0.5);
    }
}
