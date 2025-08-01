public class p_2_3_10 {

    public static int recurrent1(int n)
    {
        if (n <= 1) return 1;
        return recurrent1(n / 2) + 1;
    }

    public static int recurrent2(int n)
    {
        if (n <= 1) return 1;
        return 2 * recurrent2(n / 2) + 1;
    }

    public static int recurrent3(int n)
    {
        if (n <= 1) return 1;
        return 2 * recurrent3(n / 2) + n;
    }

    public static int recurrent4(int n)
    {
        if (n <= 1) return 1;
        return 4 * recurrent4(n / 2) + 3;
    }

    public static int recurrent_general(int n, int a, int b)
    {
        if (n <= 1) return 1;
        return a * recurrent4(n / 2) + b;
    }


    public static void main(String[] args)
    {

    }
}
