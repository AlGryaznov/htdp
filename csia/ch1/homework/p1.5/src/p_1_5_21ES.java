import java.awt.*;

public class p_1_5_21ES {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.enableDoubleBuffering();

        double angle = 360.0 / n;

        double x0 = 0;
        double y0 = 0;
        for (double i = 0; i < 360; i = i + 0.01) {

            double theta = Math.toRadians(i);
            double r = Math.sin(n * theta);
            double x = r * Math.cos(theta);

            double y = r * Math.sin(theta);
            StdDraw.line(x0, y0, x, y);
            x0 = x;
            y0 = y;
        }

        StdDraw.show();
    }
}
