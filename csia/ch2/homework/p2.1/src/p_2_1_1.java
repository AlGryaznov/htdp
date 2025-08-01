public class p_2_1_1 {
    public static void main(String[] args)
    {
        int ai1 = 1;
        int ai2 = 2;
        int ai3 = 3;
        System.out.printf("a1 = %d, a2 = %d, a3 = %d, max - %d\n",
                ai1, ai2, ai3, max3(ai1, ai2, ai3));

        double ad1 = 3.1;
        double ad2 = 2.4;
        double ad3 = 4.7;
        System.out.printf("a1 = %.1f, a2 = %.1f, a3 = %.1f, max - %.1f\n",
                ad1, ad2, ad3, max3(ad1, ad2, ad3));
    }

    public static int max3(int a1, int a2, int a3)
    {
        return Math.max(Math.max(a1, a2), a3);
    }

    public static double max3(double a1, double a2, double a3)
    {
        return Math.max(Math.max(a1, a2), a3);
    }
}