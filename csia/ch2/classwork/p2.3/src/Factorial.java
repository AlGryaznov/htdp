public class Factorial {

    public static int factorial_v1(int n)
    {
        if (n <= 1) return 1;
        return factorial_v1(n - 1) * n;
    }

    public static int factorial_v0(int n)
    {
        if (n == 1) return 1;
        return factorial_v0(n - 1) * n;
    }

    public static int factorial(int n)
    {
        return factorial_v1(n);
    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {

            System.out.printf("factorial(%d) = %d\n", i, factorial(i));
        }
    }
}