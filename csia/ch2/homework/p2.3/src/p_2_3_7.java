public class p_2_3_7 {

    public static boolean gcdlike(int p, int q)
    {
        if (q == 0) return (p == 1);  // two of them simple
        return gcdlike(q, p % q);
    }

    public static void main(String[] args)
    {
        StdOut.println(gcdlike(3, 5));
    }
}
