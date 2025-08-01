import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdStats;

import java.awt.*;

public class p_3_1_4 {
    public static void main(String[] args) {

        Picture pic = new Picture(args[0]);

        int w = pic.width();
        int h = pic.height();
        double[] shades = new double[256];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                 Color c = Luminance.toGray(pic.get(i,j));
                 shades[c.getRed()]++;
            }
            StdOut.println();
        }

        StdDraw.setYscale(0, StdStats.max(shades));
        StdStats.plotBars(shades);
        
    }
}
