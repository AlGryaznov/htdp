import java.awt.*;

public class p_1_5_34 {

    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        double rx = 0.480, ry = 0.860;
        double vx = 0.015, vy = 0.023;
        double radius = 0.05;
        StdDraw.enableDoubleBuffering();

        StdDraw.setPenColor(Color.GRAY);
        StdDraw.filledRectangle(0.0, 0.0, 1, 1);


        StdDraw.setPenColor(Color.WHITE);
        while (true) {

            if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;
            if (Math.abs(ry + vy) + radius > 1.0) vy = -vy;
            rx += vx;
            ry += vy;

            //StdDraw.clear();
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show();
            StdDraw.pause(20);

        }
    }
}
