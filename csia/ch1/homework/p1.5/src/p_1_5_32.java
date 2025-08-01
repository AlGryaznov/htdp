import java.awt.*;

public class p_1_5_32 {
    public static void main(String[] args) {


        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-2, 2);
        StdDraw.setYscale(-2, 2);

        final double clen = 1.5;
        final double slen = clen - 0.2;
        final double mlen = clen - 0.1;
        final double hlen = clen - 0.5;

        int s = 0;
        int m = 15;
        int h = 0;
        while (true) {

            StdDraw.clear();

            double sangle = Math.toRadians(90 - s*6);
            double mangle = Math.toRadians(90 - m*6);
            double hangle = Math.toRadians(90 - h*15);

            StdDraw.setPenRadius(0.002);
            StdDraw.setPenColor(Color.RED);
            StdDraw.line(0, 0, slen*Math.cos(sangle), slen*Math.sin(sangle));
            StdDraw.line(0, 0, slen*Math.cos(sangle), slen*Math.sin(sangle));

            StdDraw.setPenRadius(0.002 * 4);
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.line(0, 0, mlen*Math.cos(mangle), mlen*Math.sin(mangle));
            StdDraw.line(0, 0, mlen*Math.cos(mangle), mlen*Math.sin(mangle));

            StdDraw.setPenRadius(0.002 * 6);
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.line(0, 0, hlen*Math.cos(hangle), hlen*Math.sin(hangle));
            StdDraw.line(0, 0, hlen*Math.cos(hangle), hlen*Math.sin(hangle));


            StdDraw.circle(0, 0, clen);
            StdDraw.pause(1000);

            StdDraw.show();

            s += 1;
            m += s / 60;
            h += m / 60;
            s = s % 60;
            m = m % 60;
            h = h % 24;
        }
    }
}
