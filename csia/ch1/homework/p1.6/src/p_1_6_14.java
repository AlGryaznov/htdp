public class p_1_6_14 {
    public static void main(String[] args) {

        int n = StdIn.readInt();
        int m = StdIn.readInt();

        StdOut.println(n);

        for (int i = 0; i < n; i++) {

            int h = (int)(Math.random() * (m + 1));
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < h; j++) {

                int r = (int)(Math.random() * n);

                if (r == i) {
                    r = (r + 1) % n;
                }

                s.append(i).append(" ").append(r).append("  ");
            }
            if (h > 0) {
                StdOut.println(s.toString());
            }
        }
    }
}
