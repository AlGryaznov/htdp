public class p_2_1_16 {

    public static double max(double[] a)
    {
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < a.length; i++) {

            if (max < a[i])
                max = a[i];
        }
        return max;
    }
    public static double min(double[] a)
    {
        double min = Double.POSITIVE_INFINITY;

        for (int i = 0; i < a.length; i++) {

            if (min > a[i])
                min = a[i];
        }
        return min;
    }

    public static void printa(double[] a)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {

            sb.append(String.format("%.2f ",a[i]));
        }
        StdOut.printf("%s\n", sb.toString());
    }


    public static void main(String[] args)
    {
        double[] a = new double[args.length];

        for (int i = 0; i < args.length; i++) {

            a[i] = Double.parseDouble(args[i]);
        }
        printa(a);


        double max =  max(a);
        double min =  min(a);

        double diff = max - min;
        StdOut.println(diff);


        for (int i = 0; i < a.length; i++) {

            a[i] = (a[i] - min) / diff;
        }


        printa(a);
    }
}
