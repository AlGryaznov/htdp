public class SerpinskiTriangle {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);

        double[] cx = {0.000, 1.000, 0.500};
        double[] cy = {0.000, 0.000, 0.866};
        double x = 0.0, y = 0.0;

        for (int t = 0; t < trials; t++) {

            int r = StdRandom.uniform(3);
            x = (x + cx[r]) / 2.0;
            y = (y + cy[r]) / 2.0;
            StdDraw.point(x, y);
        }
    }
}
