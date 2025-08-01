public class p_1_6_19 {
    public static void main(String[] args) {

        int n = StdIn.readInt();

        double[] p = new double[n];
        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            p[i] = StdIn.readDouble();
            x[i] = StdIn.readDouble();
            y[i] = StdIn.readDouble();
        }
        
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);

        for (int i = 0; i < n; i++) {

            StdDraw.filledCircle(x[i], y[i], p[i]);
        }


        StdDraw.show();
    }
}
