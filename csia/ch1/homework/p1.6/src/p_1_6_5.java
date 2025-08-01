public class p_1_6_5 {

    /*
     * 4-digits 10^8
     * 5-digits 10^10
     */
    public static void main(String[] args) {

        long trials = Long.parseLong(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        double[][] p = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = StdIn.readDouble();
            }
        }

        int page = 0;
        long[] freq = new long[n];

        for (long t = 0; t < trials; t++) {

            double r = Math.random();
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += p[page][i];
                if (r < sum) { page = i; break; }
            }
            freq[page]++;
        }

        for (int i = 0; i < n; i++) {
            StdOut.printf("%8.5f", (double)freq[i] / trials);
        }
        StdOut.println();
    }
}

