public class p_1_6_3 {
    public static void main(String[] args) {

        double onpage = Double.parseDouble(args[0]);
        int n = StdIn.readInt();
        double p0 = 1.0/n;

        int[][] counts = new int[n][n];
        int[] outDegrees = new int[n];

        while (!StdIn.isEmpty()) {

            int i = StdIn.readInt();
            int j = StdIn.readInt();

            counts[i][j]++;
            outDegrees[i]++;
        }

        StdOut.println(n + " " + n);

        double offpage = 1 - onpage;
        for (int i = 0; i < n; i++) {

            if (outDegrees[i] == 0) {

                for (int j = 0; j < n; j++) {

                    StdOut.printf("%8.5f", p0);
                }
                StdOut.println();

            } else {

                for (int j = 0; j < n; j++) {

                    double p = onpage*counts[i][j]/outDegrees[i] + offpage/n;
                    StdOut.printf("%8.5f", p);
                }
                StdOut.println();
            }
        }
    }
}
