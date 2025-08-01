public class p_2_2_3NF {


    public static void test_bernoulli(int n, int trials)
    {
        double[] freq = new double[n + 1];

        for (int t = 0; t < trials; t++) {

            int count = 0;
            for (int i = 0; i < n; i++) {

                if (StdRandom.bernoulli(0.5)) count++;
            }
            freq[count]++;
        }

        double[] norm = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            norm[i] = (double) freq[i] / trials;
        }

        StdStats.plotBars(norm);
    }

    public static void test_uniform(int n, int trials)
    {
        double[] freq = new double[n];

        for (int t = 0; t < trials; t++)
        {
            for (int i = 0; i < n; i++) {

                freq[StdRandom.uniform(10)]++;
            }
        }

        double[] norm = new double[n];
        for (int i = 0; i < n; i++) {
            norm[i] = (double) freq[i] / (n * trials);
        }

        StdStats.plotBars(norm);
    }

    public static void test_poisson(int n, int trials)
    {
        int m = 3 * n;
        double[] freq = new double[m];

        for (int t = 0; t < trials; t++) {
            for (int i = 0; i < n; i++) {

                freq[StdRandom.poisson(n)]++;
            }
        }

        double[] norm = new double[m];
        for (int i = 0; i < m; i++) {
            norm[i] = (double) freq[i] / (n * trials);
        }

        StdStats.plotBars(norm);
    }


    public static void test_geometric(int n, int trials)
    {

    }
    public static void test_exponential(int n, int trials)
    {

    }

    public static void test_gaussian(int n, int trials)
    {

    }

    public static void test_pareto(int n, int trials)
    {

    }

    public static void test_cauchy(int n, int trials)
    {

    }

    public static void test_shuffle(int n, int trials)
    {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = i + 1;
        }

        StdRandom.shuffle(a);

        double[] norm = new double[n];
        for (int i = 0; i < n; i++) {
            norm[i] = (double) a[i] / n;
        }

        StdStats.plotBars(norm);
    }

    public static void test_permutation(int n, int trials)
    {
        int[] a = StdRandom.permutation(n, 4);

        double[] norm = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            norm[i] = (double) a[i] / n;
        }

        StdStats.plotBars(norm);
    }

    public static void test_discrete(int n, int trials)
    {
        int[] probs = new int[n];
        int[] freqs = new int[n];
        int mid = (int) Math.ceil(n / 2.0);

        for (int i = 0; i < n; i++) {

            if (i + 1 > mid) probs[i] = n - i;
            else             probs[i] = i + 1;
        }

        for (int t = 0; t < trials; t++) {
            freqs[StdRandom.discrete(probs)]++;
        }

        double[] norm = new double[n];
        for (int i = 0; i < n; i++) {
            norm[i] = ((double) freqs[i]) / trials;
        }

        StdStats.plotBars(norm);
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int showDelay = 3000;
        /*
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.text(0.5, 0.5, "discrete");
        test_discrete(n, trials);
        StdDraw.pause(showDelay);
        StdDraw.clear();

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.text(0.5, 0.5, "bernoulli");
        test_bernoulli(n, trials);
        StdDraw.pause(showDelay);
        StdDraw.clear();

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.text(0.5, 0.5, "uniform");
        test_uniform(n, trials);
        StdDraw.pause(showDelay);
        StdDraw.clear();

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.text(0.5, 0.5, "shuffle");
        test_shuffle(n, trials);
        StdDraw.pause(showDelay);
        StdDraw.clear();

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.text(0.5, 0.5, "permutation");
        test_permutation(n, trials);
        StdDraw.pause(showDelay);
        StdDraw.clear();

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.text(0.5, 0.5, "poisson");
        test_poisson(n, trials);
        StdDraw.pause(showDelay);
        StdDraw.clear();
        */

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.text(0.5, 0.5, "pareto");
        test_pareto(n, trials);
        StdDraw.pause(showDelay);
        StdDraw.clear();
    }
}
