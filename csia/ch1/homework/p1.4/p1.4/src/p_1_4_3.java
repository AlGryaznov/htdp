public class p_1_4_3 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 1; i < n; i++) {

            int xx = x[i - 1] - x[i];
            xx *= xx;
            int yy = y[i - 1] - y[i];
            yy *= yy;
            double sum = Math.sqrt(yy + xx);
            System.out.println(sum);
        }
    }
}
