import java.awt.*;

public class p_3_1_3 {

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        Color[] color = new Color[n];

        for (int i = 0; i < n; i++) {
            int r = Integer.parseInt(args[i]);
            int g = Integer.parseInt(args[i + 1]);
            int b = Integer.parseInt(args[i + 2]);
            color[i] = new Color(r, g, b);
        }


        double hl = 0.2;
        for (int i = 0; i < n; i++) {
            StdDraw.setPenColor(color[i]);
            StdDraw.filledSquare(.25, 0.5, hl);
            hl /= 2.0;
        }

        hl = 0.2;
        for (int i = n - 1; i >= 0; i--) {
            StdDraw.setPenColor(color[i]);
            StdDraw.filledSquare(.75, 0.5, hl);
            hl /= 2.0;
        }

    }
}
