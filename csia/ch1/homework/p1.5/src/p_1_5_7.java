public class p_1_5_7 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        boolean[] a = new boolean[n + 1];
        a[0] = true;

        for (int i = 1; i < n; i++) {

            int ind = StdIn.readInt();

            a[ind] = true;
        }

        for (int i = 1; i < n + 1; i++) {

            if (!a[i]) StdOut.print(i + " ");
        }
    }
}
