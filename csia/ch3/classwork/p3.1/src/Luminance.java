import edu.princeton.cs.algs4.StdOut;

import java.awt.*;

public class Luminance {

    public static Color toGray(Color color)
    {
        int c = (int) intensity(color);
        return new Color(c, c, c);
    }

    public static double intensity(Color color)
    {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        return 0.299*r + 0.587*g + 0.114*b;
    }

    public static boolean areCompatible(Color a, Color b)
    {
        return Math.abs(intensity(a) - intensity(a)) >= 128.0;
    }

    public static void main(String[] args) {
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        Color c1 = new Color(a[0], a[1], a[2]);
        Color c2 = new Color(a[3], a[4], a[5]);

        StdOut.println(areCompatible(c1, c2));
    }
}
