public class p_1_6_17 {
    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        double[][] p = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = StdIn.readDouble();
            }
        }

        long[] intervals = new long[n];
        long[] count = new long[n];

        int page = 0;
        int[] freq = new int[n];

        for (int t = 0; t < trials; t++) {

            double r = Math.random();
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += p[page][i];
                if (r < sum) { page = i; break; }
            }

            for (int i = 0; i < n; i++) {
                count[i]++;
            }

            intervals[page] += count[page];
            count[page] = 0;
            freq[page]++;
        }

        StdOut.println("intervals:");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%10.2f", (double)intervals[i] / freq[i]);
        }
        StdOut.println();

        StdOut.println("ranks:");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%10.7f", (double)freq[i] / trials);
        }
        StdOut.println();
    }
}
