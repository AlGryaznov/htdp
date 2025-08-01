public class p_2_1_19 {

    public static int[] histogram(int[] a, int m)
    {
        int[] b = new int[m];
        for (int i = 0; i < a.length; i++) {

            b[a[i]]++;
        }
        return b;
    }

    public static void printa(int[] a)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {

            sb.append(String.format("a[%d] = %d\n", i, a[i]));
        }
        StdOut.printf(sb.toString());
    }

    public static void main(String[] args)
    {
        int n = StdIn.readInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = StdIn.readInt();
        }

        printa(histogram(a, 5));
    }
}
