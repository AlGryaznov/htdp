public class p_1_5_16 {

    public static void main(String[] args) {

        double x = 0;
        double y = 0;
        double m = 0;

        while (!StdIn.isEmpty()) {

            double xi = StdIn.readDouble();
            double yi = StdIn.readDouble();
            double mi = StdIn.readDouble();

            m += mi;
            x += mi*xi;
            y += mi*yi;
        }

        StdOut.printf("(%4.2f, %4.2f, %4.2f)\n", x/m, y/m, m);
    }
}
