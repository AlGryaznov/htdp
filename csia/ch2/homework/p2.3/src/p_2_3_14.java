import java.awt.*;

public class p_2_3_14 {

    final static double r = 0.02;
    final static int delay = 100;
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
        StdDraw.pause(delay);
        StdDraw.line(x1, y0, x1, y1);
        StdDraw.pause(delay);
        StdDraw.line(x0, y, x1, y);
        StdDraw.pause(delay);

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
