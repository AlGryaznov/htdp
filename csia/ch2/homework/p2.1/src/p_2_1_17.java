public class p_2_1_17 {

    public static String[] reverse(String[] a)
    {
        String[] b = new String[a.length];

        for (int i = 0; i < b.length; i++) {

            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    public static void reverseInPlace(String[] a)
    {
        for (int i = 0; i < a.length / 2; i++) {

            int ind = a.length - i - 1;
            String s = a[ind];
            a[ind] = a[i];
            a[i] = s;
        }
    }

    public static void printa(String[] a)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {

            sb.append(String.format("%s ", a[i]));
        }
        StdOut.printf("%s\n", sb.toString());
    }


    public static void main(String[] args)
    {
        printa(reverse(args));
        reverseInPlace(args);
        printa(args);
    }
}
