public class p_1_6_18 {
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

        boolean[] isVisitedOnce = new boolean[n];

        int count = 0;
        int page = 0;
        int[] freq = new int[n];

        for (int k = 0; k < trials; k++) {

            double r = Math.random();
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += p[page][i];
                if (r < sum) { page = i; break; }
            }

            isVisitedOnce[page] = true;
            boolean isAllVisitedOnce = true;
            for (int j = 0; j < n; j++) {

                if (!isVisitedOnce[j]) {
                    isAllVisitedOnce = false;
                    break;
                }
            }
            if (isAllVisitedOnce) {
                count = k + 1;
                break;
            }
            freq[page]++;
        }

        if (count > 0) {
            StdOut.printf("all pages visited for %d jumps of %d\n", count, trials);
        } else {
            StdOut.println("not all pages visited");
        }/*
        StdOut.println("ranks:");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%10.7f", (double)freq[i] / trials);
        }
        StdOut.println();*/
    }
}
