public class p_2_1_18 {

    public static boolean[][] readBoolean2d()
    {
        int nc = StdIn.readInt();
        int nr = StdIn.readInt();

        boolean[][] a = new boolean[nc][nr];

        for (int i = 0; i < nc; i++) {
            for (int j = 0; j < nr; j++) {

                a[i][j] = StdIn.readBoolean();
            }
        }
        return a;
    }

    public static void printa(boolean[][] a)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i][j]) sb.append("* ");
                else         sb.append("- ");
            }
            sb.append("\n");
        }
        StdOut.printf("%s\n", sb.toString());
    }


    public static void main(String[] args)
    {
        printa(readBoolean2d());
    }
}
