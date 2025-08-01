public class p_2_2_4 {

    public static int getPermNum(int[] a, int[][] allPerms)
    {
        int index = -1;
        for (int i = 0; i < allPerms.length; i++) {

            index = i;
            for (int j = 0; j < a.length; j++) {
                if (a[j] != allPerms[i][j]) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                break;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        int[][] allPerms = {
                {1, 2, 3}, {1, 3, 2},
                {2, 1, 3}, {2, 3, 1},
                {3, 1, 2}, {3, 2, 1}
        };
        int n = 3;
        int[] a = new int[n];
        int[] counts = new int[allPerms.length];

        for (int t = 0; t < trials; t++) {

            for (int i = 0; i < n; i++) {
                a[i] = i + 1;
            }

            StdRandom.shuffle(a);
            counts[getPermNum(a, allPerms)]++;
        }

        double[] norm = new double[n];
        for (int i = 0; i < n; i++) {
            norm[i] = ((double) counts[i]) / trials;
        }

        StdStats.plotBars(norm);
    }
}
