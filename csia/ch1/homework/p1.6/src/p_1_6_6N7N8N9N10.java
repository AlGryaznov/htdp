public class p_1_6_6N7N8N9N10 {

    /*
     * 3-digits 22
     * 4-digits 29
     * 10-digits 71
     */

    /*
     * for 1_6_9 and 1_6_10 link is "23 22"
     * page 23 increase rank and 22 decrease rank
     */

    public static void main(String[] args) {

        //int trials = Integer.parseInt(args[0]);
        int trials = 1;
        double epsilon = Double.parseDouble(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        double[][] p0 = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p0[i][j] = StdIn.readDouble();
            }
        }

        double[] prevRanks = new double[n];

        while(true) {

            double[][] p = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    p[i][j] = p0[i][j];
                }
            }
            double[] ranks = new double[n];
            ranks[0] = 1.0;

            for (int t = 0; t < trials; t++) {

                double[] newRanks = new double[n];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {

                        newRanks[j] += ranks[k] * p[k][j];
                    }
                }
                for (int j = 0; j < n; j++) {
                    ranks[j] = newRanks[j];
                }
            }


            boolean isFounded = true;
            for (int j = 0; j < n; j++) {

                if (Math.abs(prevRanks[j] - ranks[j]) > epsilon) {
                    isFounded = false;
                    break;
                }
            }

            for (int j = 0; j < n; j++) {
                prevRanks[j] = ranks[j];
            }

            if (isFounded) break;
            trials++;
        }

        StdOut.printf("trials %d\n", trials);
        for (int i = 0; i < n; i++) {

            if (i % 5 == 0)
                StdOut.printf("\n%d ", i + 1);

            StdOut.printf("%15.12f", prevRanks[i]);
        }
        StdOut.println();
    }
}

