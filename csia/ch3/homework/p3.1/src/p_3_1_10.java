public class p_3_1_10 {
    public static String complementWatsonCrick(String s)
    {

        char[] a = s.toCharArray();


        for (int i = 0; i < a.length; i++) {

            if (a[i] == 'A') a[i] = 'T';
            else if (a[i] == 'C') a[i] = 'G';
            else if (a[i] == 'T') a[i] = 'A';
            else                  a[i] = 'C';
        }

        return new String(a);

    }

    public static void main(String[] args) {

        StdOut.println(args[0]);
        StdOut.println(complementWatsonCrick(args[0]));
    }
}
