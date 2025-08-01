public class p_1_5_29 {
    public static void main(String[] args) {

        int n = StdIn.readInt();
        int m = StdIn.readInt();
        int[][] a = new int[n + 2][m + 2];
        int count = 0;

        {
            int i = 1;
            int j = 1;
            while (!StdIn.isEmpty()) {

                a[i][j] = StdIn.readInt();

                if (j == m) {
                    j = 1;
                    i += 1;
                    if (i == n + 1) break;
                } else {
                    j += 1;
                }
            }
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                int x1 = (a[i][j] - a[i + 1][j]);
                int x2 = (a[i][j] - a[i - 1][j]);
                int x3 = (a[i][j] - a[i][j - 1]);
                int x4 = (a[i][j] - a[i][j + 1]);

                int x = x1 | x2 | x3 | x4;

                if (x > 0) {

                    System.out.printf("x1 = %d, x2 = %d, x3 = %d, x4 = %d\n", x1, x2, x3, x4);
                    count++;
                }
            }
        }

        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < m + 2; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("count = " + count);
    }
}
