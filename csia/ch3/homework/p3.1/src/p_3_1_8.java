import edu.princeton.cs.algs4.Picture;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;

public class p_3_1_8 {


    public static boolean isCompatableWithPicArea(
            Picture pic,
            int xUpperLeft,
            int yUpperLeft,
            int xBottomRight,
            int yBottomRight,
            Color color)
    {
        //boolean result = true;
        for (int i = yUpperLeft; i < yBottomRight + 1; i++) {
            for (int j = xUpperLeft; j < xBottomRight + 1; j++) {

                if (!Luminance.areCompatible(color, pic.get(i, j))){

                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Picture pic = new Picture(args[0]);
        int xUpperLeft = Integer.parseInt(args[1]);
        int yUpperLeft = Integer.parseInt(args[2]);
        int xBottomRight = Integer.parseInt(args[3]);
        int yBottomRight = Integer.parseInt(args[4]);

        if ((xUpperLeft > xBottomRight) || (yUpperLeft > yBottomRight)) {

            StdOut.println("Bad coordinates");
            return;
        }


        while (!StdIn.isEmpty()) {
            StdOut.println("Enter color:");

            int r = StdIn.readInt();
            int g = StdIn.readInt();
            int b = StdIn.readInt();


            Color c = new Color(r, g, b);

            boolean isCompatable = isCompatableWithPicArea(
                    pic,
                    xUpperLeft,
                    yUpperLeft,
                    xBottomRight,
                    yBottomRight,
                    c
            );

            if (isCompatable) {

                StdOut.printf("(%d, %d, %d) is compatable\n", r, g, b);

            } else {
                StdOut.printf("(%d, %d, %d) isn't compatable\n", r, g, b);
            }

        }
    }
}
