public class p_1_4_19 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[][] a = new boolean[n][n];
        boolean[][] b = new boolean[n][n];
        boolean[][] p = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                boolean r = Math.random() < 0.5;
                a[i][j] = r;
                r = Math.random() < 0.5;
                b[i][j] = r;
            }
        }




        System.out.print("a \t");

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + "\t");
            for (int j = 0; j < n; j++) {

                if (a[i][j]) System.out.print("* ");
                else         System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("b \t");

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + "\t");
            for (int j = 0; j < n; j++) {

                if (b[i][j]) System.out.print("* ");
                else         System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                boolean sum = false;
                for (int l = 0; l < n; l++) {

                    sum = sum || (a[i][l] && b[l][j]);
                }
                p[i][j] = sum;
            }
        }


        System.out.println();
        System.out.print("p \t");

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + "\t");
            for (int j = 0; j < n; j++) {

                if (p[i][j]) System.out.print("* ");
                else         System.out.print("  ");
            }
            System.out.println();
        }
    }
}
