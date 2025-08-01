public class p_1_4_29 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        boolean[][] a;
        a = new boolean[n][n];
        int[][] b = {{0,0}, {0,1}, {1,0}, {1, 1}};

        if (n == 1) {
            System.out.println("T");
            return;
        }
        a[0][0] = true;

        for (int m = 1; m < n; m = m + m) {
            for (int k = 1; k < 4; k++ ) {

                int i = m * b[k][0];
                int j = m * b[k][1];

                for (int l = 0; l < m; l++) {
                    for (int o = 0; o < m; o++) {

                        a[i + l][j + o] = (b[k][0] == b[k][1]) != a[l][o];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                String s;
                if (a[i][j]) s = "T";
                else s = "F";

                System.out.print( s + " ");
            }
            System.out.println();
        }
    }
}
