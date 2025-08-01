public class p_1_4_32 {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        int[][] b = new int[m + 2][n + 2];
        int[][] a;
        a = new int[m + 2][n + 2];

        for (int i = 0; i < m + 2; i++) {
            for (int j = 0; j < n + 2; j++) {


                if ((i == 0) || (i == m + 1) ||
                    (j == 0) || (j == n + 1)) {

                    a[i][j] = 0;

                } else {

                    if (Math.random() < p) a[i][j] = 1;
                    else                   a[i][j] = 0;
                }
            }
        }


        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                //if (a[i][j] == -1) continue;

                  b[i][j] = (a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] +
                            a[i][j - 1] + a[i][j + 1] +
                            a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1]) * (1 - a[i][j]);

            }
        }



        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                String s;
                if (a[i][j] == 1) s = "*";
                else         s = ".";

                System.out.print(s + " ");
                //System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                String s;
                if (a[i][j] == 1) s = "*";
                else              s = Integer.toString(b[i][j]);

                System.out.print(s + " ");
                //System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
