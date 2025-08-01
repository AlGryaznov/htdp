public class p_2_3_4 {

    public static String ex234(int n)
    {
        if (n <= 0) return "";
        return ex234(n - 3) + n + ex234(n - 2) + n;
    }

    public static void main(String[] args)
    {
        StdOut.println(ex234(6)); //311361142246
    }
}
