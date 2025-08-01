import java.awt.*;

public class p_1_5_18 {

    public static void main(String[] args) {

        final double n = 8;
        final double HALF_SQUARE_SIZE = 5;
        final double SQUARE_SIZE = HALF_SQUARE_SIZE * 2;
        final double FIELD_SIZE = SQUARE_SIZE * n;

        Color c = Color.BLACK;

        StdDraw.setXscale(0, FIELD_SIZE);
        StdDraw.setYscale(0, FIELD_SIZE);
        StdDraw.enableDoubleBuffering();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (c == Color.RED) {

                    StdOut.println("black");
                    c = Color.BLACK;
                    StdDraw.setPenColor(c);

                } else {

                    StdOut.println("red");
                    c = Color.RED;
                    StdDraw.setPenColor(c);
                }

                StdDraw.filledSquare(
                        j * SQUARE_SIZE + HALF_SQUARE_SIZE,
                        i * SQUARE_SIZE + HALF_SQUARE_SIZE,
                        HALF_SQUARE_SIZE);

                //StdDraw.pause(500);

            }
            if (c == Color.RED)     c = Color.BLACK;
            else                    c = Color.RED;

        }
        StdDraw.show();
    }
}
