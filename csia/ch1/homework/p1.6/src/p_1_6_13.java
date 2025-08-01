public class p_1_6_13 {
    public static void Markov(double[][] mx1, long trial) {

        int n = mx1.length;
        double[][] mx2;
        mx2 = new double[n][n];

        for (int i = 0; i < n; i++) {
            System.arraycopy(mx1[i], 0, mx2[i], 0, n);
        }
        for (long t = 0; t < trial; t++) {
            for (int i = 0; i < n; i++) {

                double[] ranks = new double[n];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {

                        ranks[j] += mx1[i][k] * mx2[k][j];
                    }
                }
                System.arraycopy(ranks, 0, mx1[i], 0, n);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                StdOut.printf("%8.5f ", mx1[i][j]);
            }
            StdOut.println();
        }
    }


    public static void MatrixPower(double[][] mx1, long power) {

        int n = mx1.length;
        double[][] mx2;
        mx2 = new double[n][n];

        for (int i = 0; i < n; i++) {
            System.arraycopy(mx1[i], 0, mx2[i], 0, n);
        }
        for (long p = 1; p < power; p*=2) {
            for (int i = 0; i < n; i++) {

                double[] ranks = new double[n];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {

                        ranks[j] += mx1[i][k] * mx2[k][j];
                    }
                }
                System.arraycopy(ranks, 0, mx1[i], 0, n);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    System.arraycopy(mx1[i], 0, mx2[i], 0, n);
                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                StdOut.printf("%8.5f ", mx1[i][j]);
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {

        long trial = Long.parseLong(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        double[][] mx1 = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mx1[i][j] = StdIn.readDouble();
            }
        }

        MatrixPower(mx1, trial);



    }
}

