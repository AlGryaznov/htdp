public class p_2_1_22 {

    public static boolean any(boolean[] a)
    {
        boolean t = false;

        if (a.length > 0) {

            int i = 0;
            while ((i < a.length) && !t) {

                t = a[i];
                i++;
            }
        }
        return t;
    }

    public static boolean all(boolean[] a)
    {
        boolean t = true;

        if (a.length > 0) {

            int i = 0;
            while ((i < a.length) && t) {

                t = a[i];
                i++;
            }

        } else {

            t = false;
        }
        return t;
    }

    public static boolean[] readBooleanArray()
    {
        int n = StdIn.readInt();

        boolean[] a = new boolean[n];

        for (int i = 0; i < n; i++) {

            a[i] = StdIn.readBoolean();
        }
        return a;
    }

    public static void main(String[] args)
    {
        StdOut.println(all(readBooleanArray()));
        StdOut.println(any(readBooleanArray()));
    }
}
