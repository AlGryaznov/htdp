public class p_1_5_10 {

    public static void main(String[] args) {

        int n = 10;

        while (!StdIn.isEmpty()) {
            for (int i = 0; i < n; i++) {

                int x = StdIn.readInt();
                StdOut.printf("%2d ", x);
            }
            StdOut.println();
        }
    }
}


