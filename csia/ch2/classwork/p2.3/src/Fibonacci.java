public class Fibonacci {


    private static long[] fib_mem = new long [92];
    private static long count = 0;


    public static long fibonacci_recursive(int n)
    {
        count++;
        if (n <= 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacci_dynamic(int n)
    {
        count++;
        if (n <= 2) return 1;
        if (fib_mem[n] == 0) {
            fib_mem[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return fib_mem[n];
    }

    public static long fibonacci(int n)
    {
        return fibonacci_recursive(n);
    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        fibonacci(n);
        for (int i = 1; i <= n; i++) {

            count = 0;
            StdOut.printf("(%d, %d) ", fibonacci(i), count);
        }
        StdOut.println();
    }
}
