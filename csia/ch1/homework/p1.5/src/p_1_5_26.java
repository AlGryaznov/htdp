import java.awt.*;

public class p_1_5_26 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        double min = Double.parseDouble(args[2]);
        double max = Double.parseDouble(args[3]);



        for (int i = 0; i < n; i++) {

            if ( Math.random() < p) StdDraw.setPenColor(Color.BLACK);
            else                    StdDraw.setPenColor(Color.WHITE);

            StdDraw.setPenRadius(min + Math.random() * (max - min));
            StdDraw.point(Math.random(), Math.random());
        }
    }
}
