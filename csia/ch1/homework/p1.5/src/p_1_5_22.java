public class p_1_5_22 {

    public static void main(String[] args) {

        String s = args[0];
        double speed = Double.parseDouble(args[1]);

        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setPenRadius(0.01);
        StdDraw.enableDoubleBuffering();

        while (true) {

            for (double j = -1; j <= 1; j += speed) {

                StdDraw.clear();
                StdDraw.textLeft(j,0, s);
                StdDraw.pause(10);
                StdDraw.show();
            }
        }
    }
}
