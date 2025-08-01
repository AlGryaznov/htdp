import java.awt.*;

public class p_1_5_19 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        final double r = 20;
        final double SIZE = r * 3;
        final double center = SIZE / 2;

        double[] x = new double[n];
        double[] y = new double[n];


        StdDraw.setXscale(0, SIZE);
        StdDraw.setYscale(0, SIZE);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.enableDoubleBuffering();

        double angle = 360.0 / n;

        for (int i = 0; i < n; i++) {

            double rad = (angle * i * Math.PI) / 180.0;
            x[i] = center + r * Math.cos(rad);
            y[i] = center + r * Math.sin(rad);
            StdDraw.point(x[i], y[i]);
        }

        StdDraw.setPenColor(Color.GRAY);
        StdDraw.setPenRadius(0.005);
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (Math.random() < p) {

                    StdDraw.line(x[i], y[i], x[j], y[j]);
                }
            }
        }

        StdDraw.show();
    }
}
