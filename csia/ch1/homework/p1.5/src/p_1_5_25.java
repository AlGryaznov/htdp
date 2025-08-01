import java.awt.*;

public class p_1_5_25 {

    public static void main(String[] args) {

        final double SIZE = 1.0;
        final double SIZE_1S2 = 0.5;
        final double SIZE_1S4 = 0.25;
        final double SIZE_1S8 = 0.125;


        StdDraw.enableDoubleBuffering();

        Color[][] colors = { {Color.BLACK, Color.GRAY, Color.BLACK, Color.BLACK, Color.BLACK, Color.WHITE},
                             {Color.WHITE, Color.GRAY, Color.BLACK, Color.BLACK, Color.BLACK, Color.WHITE},
                             {Color.BLACK, Color.GRAY, Color.BLACK, Color.BLACK, Color.WHITE, Color.WHITE},
                             {Color.WHITE, Color.GRAY, Color.BLACK, Color.BLACK, Color.GRAY, Color.GRAY}};


        double[] xP0 = {0, 0,    SIZE,  SIZE  };
        double[] yP0 = {0, SIZE, SIZE,  0};

        double[] xP1 = {SIZE_1S2, SIZE,       SIZE_1S2, 0  };
        double[] yP1 = {SIZE,      SIZE_1S2,  0,         SIZE_1S2};

        double[] xP21 = {0,          SIZE_1S8,             0};
        double[] yP21 = {SIZE_1S2,   SIZE_1S2 + SIZE_1S8,  SIZE_1S2 + SIZE_1S4  };
        double[] xP22 = {0,          SIZE_1S8,             0};
        double[] yP22 = {SIZE_1S4,   SIZE_1S4 + SIZE_1S8,  SIZE_1S2 };
        double[] xP23 = {SIZE,       SIZE - SIZE_1S8,             SIZE};
        double[] yP23 = {SIZE_1S2,   SIZE_1S2 + SIZE_1S8,  SIZE_1S2 + SIZE_1S4};
        double[] xP24 = {SIZE,       SIZE - SIZE_1S8,             SIZE};
        double[] yP24 = {SIZE_1S2 - SIZE_1S4,   SIZE_1S2 - SIZE_1S8,  SIZE_1S2};

        double[] xP31 = {SIZE_1S4, SIZE_1S2, SIZE_1S2 - SIZE_1S8};
        double[] yP31 = {SIZE,     SIZE,     SIZE - SIZE_1S8 };
        double[] xP32 = {SIZE_1S2, SIZE_1S2 + SIZE_1S4, SIZE_1S2 + SIZE_1S8};
        double[] yP32 = {SIZE,     SIZE,     SIZE - SIZE_1S8 };
        double[] xP33 = {SIZE_1S2, SIZE_1S2 + SIZE_1S4, SIZE_1S2 + SIZE_1S8};
        double[] yP33 = {0,        0,                   SIZE_1S8 };
        double[] xP34 = {SIZE_1S4, SIZE_1S4 + SIZE_1S8, SIZE_1S2};
        double[] yP34 = {0,        SIZE_1S8,                   0 };

        double[] xP41 = {0,                   0,    SIZE_1S4};
        double[] yP41 = {SIZE_1S2 + SIZE_1S4, SIZE, SIZE};
        double[] xP42 = {SIZE - SIZE_1S4, SIZE, SIZE};
        double[] yP42 = {SIZE,            SIZE, SIZE - SIZE_1S4 };
        double[] xP43 = {SIZE_1S2 + SIZE_1S4, SIZE, SIZE};
        double[] yP43 = {0,        SIZE_1S4,  0};
        double[] xP44 = {0, 0,      SIZE_1S4};
        double[] yP44 = {0, SIZE_1S4,  0};

        double[] xP51 = {0,                   SIZE_1S4,    SIZE_1S4};
        double[] yP51 = {SIZE_1S2 + SIZE_1S4, SIZE,        SIZE - SIZE_1S4};
        double[] xP52 = {SIZE - SIZE_1S4, SIZE,            SIZE - SIZE_1S4};
        double[] yP52 = {SIZE,            SIZE - SIZE_1S4, SIZE - SIZE_1S4  };
        double[] xP53 = {SIZE_1S2 + SIZE_1S4, SIZE - SIZE_1S4, SIZE};
        double[] yP53 = {0,                   SIZE_1S4,  SIZE_1S4};
        double[] xP54 = {0,        SIZE_1S4,  SIZE_1S4};
        double[] yP54 = {SIZE_1S4, SIZE_1S4,  0};


        while (true) {

            for (int i = 0; i < colors.length; i++) {

                StdDraw.clear();
                StdDraw.setPenColor(colors[i][0]);
                StdDraw.filledPolygon(xP0, yP0);
                StdDraw.setPenColor(colors[i][1]);
                StdDraw.filledPolygon(xP1, yP1);

                StdDraw.setPenColor(colors[i][2]);
                StdDraw.filledPolygon(xP21, yP21);
                StdDraw.filledPolygon(xP22, yP22);
                StdDraw.filledPolygon(xP23, yP23);
                StdDraw.filledPolygon(xP24, yP24);

                StdDraw.setPenColor(colors[i][3]);
                StdDraw.filledPolygon(xP31, yP31);
                StdDraw.filledPolygon(xP32, yP32);
                StdDraw.filledPolygon(xP33, yP33);
                StdDraw.filledPolygon(xP34, yP34);

                StdDraw.setPenColor(colors[i][4]);
                StdDraw.filledPolygon(xP41, yP41);
                StdDraw.filledPolygon(xP42, yP42);
                StdDraw.filledPolygon(xP43, yP43);
                StdDraw.filledPolygon(xP44, yP44);

                StdDraw.setPenColor(colors[i][5]);
                StdDraw.filledPolygon(xP51, yP51);
                StdDraw.filledPolygon(xP52, yP52);
                StdDraw.filledPolygon(xP53, yP53);
                StdDraw.filledPolygon(xP54, yP54);

                StdDraw.show();
                StdDraw.pause(500);
            }
        }
    }
}
