import java.awt.*;

public class p_1_5_31 {
    public static void main(String[] args) {

        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        double Rr = (R + r);
        double ra = (r + a);

        double v = Math.toRadians(0.00);
        double x0 = Rr * Math.cos(v) - ra * Math.cos(Rr * v / r);
        double y0 = Rr * Math.sin(v) - ra * Math.sin(Rr * v / r);

        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
        //StdDraw.enableDoubleBuffering();


        StdDraw.circle(0.0, 0.0, R);
        StdDraw.setPenColor(Color.RED);

        for (double i = 0.1; i < 360; i += 0.1) {

            v = Math.toRadians(i);

            double x = Rr * Math.cos(v) - ra * Math.cos(Rr * v / r);
            double y = Rr * Math.sin(v) - ra * Math.sin(Rr * v / r);


            StdDraw.line(x0, y0, x, y);
            x0 = x;
            y0 = y;

        }
        //StdDraw.show();
    }
}
