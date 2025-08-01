public class p_1_5_3 {
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
    }
}
