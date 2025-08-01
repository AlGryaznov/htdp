import java.awt.*;

public class p_1_5_20 {

    public static void main(String[] args) {

        final double side = 20;
        final double SIZE = side * 3;
        final double center = SIZE / 2;
        final int t = 200;

        double[] x = new double[4];
        double[] y = new double[4];

        StdDraw.setXscale(0, SIZE);
        StdDraw.setYscale(0, SIZE);
        StdDraw.setPenRadius(0.01);


        x[0] = center;
        y[0] = center * 1.5;
        x[1] = center * 1.5;
        y[1] = center;
        x[2] = center;
        y[2] = center * 0.5;
        x[3] = center * 0.5;
        y[3] = center;
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledPolygon(x, y);
        StdDraw.pause(t);
        StdDraw.clear();



        StdDraw.filledPolygon(x, y);
        double xx = (x[1] - x[0]);
        xx *= xx;
        double yy = (y[1] - y[0]);
        yy *= yy;
        double radius = Math.sqrt(xx + yy) / 2.0;

        StdDraw.filledCircle(center * 0.75,center * 1.25, radius);
        StdDraw.filledCircle(center * 1.25,center * 1.25, radius);
        StdDraw.pause(t);
        StdDraw.clear();


        StdDraw.setPenColor(Color.BLACK);
        StdDraw.filledPolygon(x, y);
        StdDraw.filledCircle(center * 0.75,center * 0.75, radius);
        StdDraw.filledCircle(center * 1.25,center * 0.75, radius);

        StdDraw.pause(t);
        StdDraw.clear();


        StdDraw.setPenColor(Color.BLACK);
        radius = radius / 2;

        StdDraw.filledCircle(center,center * 1.25, radius);
        StdDraw.filledCircle(center * 0.85, center, radius);
        StdDraw.filledCircle(center * 1.15, center, radius);
        StdDraw.filledRectangle(center, center, radius / 4, radius * 2);


    }
}
