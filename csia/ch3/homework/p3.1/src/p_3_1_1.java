public class p_3_1_1 {
    public static void main(String[] args) {

        double w = Double.parseDouble(args[0]);
        int n = 4;
        double x = 0.5;
        double y = 0.5;

        int[] x_dir = {1, 0, -1, 0};
        int[] y_dir = {0, -1, 0, 1};

        Charge[] charge = new Charge[n];

        for (int i = 0; i < n; i++) {

            charge[i] = new Charge(
                    x + w * x_dir[i],
                    y + w * y_dir[i],
                    1.0);
        }

        for (int i = 0; i < n; i++) {

            StdOut.printf("potential at charge[%d] is %.4f\n", i + 1, charge[i].potentialAt(0.1, 0.1));
        }
    }
}