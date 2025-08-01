public class RandomSurfer {
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

        int page = 0;
        int[] freq = new int[n];

        for (int t = 0; t < trials; t++) {

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
