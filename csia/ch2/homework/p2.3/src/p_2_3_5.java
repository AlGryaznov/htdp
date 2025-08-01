public class p_2_3_5 {

    public static String ex235(int n)
    {
        String s = ex235(n - 3) + n + ex235(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }

    public static void main(String[] args)
    {
        ex235(10); //StackOverflowError
    }
}
