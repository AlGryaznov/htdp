public class p_1_5_4 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double avg = 0;
        double dev = 0;
        double sum = 0;
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {

            a[i] = StdIn.readDouble();
        }

        for (int i = 0; i < n; i++) {

            avg += a[i];
        }
        avg /= n;

        for (int i = 0; i < n; i++) {

            double d = (a[i] - avg);
            sum += d * d;
        }
        dev = Math.sqrt(sum/(n - 1));

        StdOut.println("average " + avg);
        StdOut.println("deviation " + dev);

        double lower = avg - 1.5 * dev;
        double upper = avg + 1.5 * dev;

        for (int i = 0; i < n; i++) {

            if ((a[i] > lower) && (a[i] < upper)) {
                StdOut.print(a[i] + " ");
            }
        }
        StdOut.println();
    }
}
