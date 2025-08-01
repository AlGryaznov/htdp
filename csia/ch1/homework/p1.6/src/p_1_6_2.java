public class p_1_6_2 {
    public static void main(String[] args) {

        double onpage = Double.parseDouble(args[0]);
        int n = StdIn.readInt();

        int[][] counts = new int[n][n];
        int[] outDegrees = new int[n];

        while (!StdIn.isEmpty()) {

            int i = StdIn.readInt();
            int j = StdIn.readInt();

            if (counts[i][j] == 0) {
                counts[i][j]++;
                outDegrees[i]++;
            }
        }

         StdOut.println(n + " " + n);

        double offpage = 1 - onpage;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                double p = onpage*counts[i][j]/outDegrees[i] + offpage/n;
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}