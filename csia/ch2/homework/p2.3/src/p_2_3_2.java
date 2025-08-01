public class p_2_3_2 {

    public static int factorial(int n)
    {
        if (n <= 1) return 1;
        return factorial(n - 1) * n;
    }

    public static double ex232(int n)
    {
        return Math.log((double)factorial(n));
    }

    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        System.out.printf("ln(factorial(%d)) = %7.4f\n", x, ex232(x));
    }
}
