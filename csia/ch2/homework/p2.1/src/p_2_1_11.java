public class p_2_1_11 {
    public static void main(String[] args)
    {
        System.out.printf("signum(%d) = %d\n", 64, signum(64));
        System.out.printf("signum(%d) = %d\n", 0, signum(0));
        System.out.printf("signum(%d) = %d\n", -332, signum(-332));
    }

    public static int signum(int n)
    {
        return ((n - 1) >> 31) + (n >> 31) + 1;
    }
}
