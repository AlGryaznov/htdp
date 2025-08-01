public class Harmonic {

    public static double harmonic(int n)
    {
        if (n == 1) return 1.0;
        return harmonic(n - 1) + 1.0 / n ;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i < n; i++) {

            System.out.printf("harmonic(%d) = %7.4f\n", i, harmonic(i));
        }
    }
}
