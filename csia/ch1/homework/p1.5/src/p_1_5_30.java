public class p_1_5_30 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double low = Double.parseDouble(args[1]);
        double high = Double.parseDouble(args[2]);
        double step = (high - low) / n;

        int[] a = new int[n + 2];

        System.out.printf("n = %d, low = %2.4f, high = %2.4f, step = %2.4f\n", n, low, high, step);

        while (!StdIn.isEmpty()) {

            double x = StdIn.readDouble();
            int i = (int)(Math.ceil((x - low)/ step));
            a[i]++;
        }

        int max = 0;
        for (int i = 1; i < a.length - 1; i++) {

            max = Math.max(a[i], max);
            System.out.print(a[i] + " ");
        }
        System.out.println();


        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, max + 1);
        StdDraw.enableDoubleBuffering();

        for (int i = 1; i < a.length - 1; i++) {

            double height = ((double) a[i]) / 2.0;
            StdDraw.filledRectangle(i - 0.5, height,0.5, height);
        }

        StdDraw.show();

    }
}
