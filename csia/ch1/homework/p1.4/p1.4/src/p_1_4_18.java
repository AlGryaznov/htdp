public class p_1_4_18 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] a;
        a = new int[n][k];
        int[][] b;
        b = new int[k][m];
        int[][] p = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {

                int r = (int)(Math.random() * 10);
                a[i][j] = r;
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {

                int r = (int)(Math.random() * 10);
                b[i][j] = r;
            }
        }

        /*
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {

                p[i][j] = 0;
            }
        }*/


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int sum = 0;
                for (int l = 0; l < k; l++) {

                    sum += a[i][l] * b[l][j];
                }
                p[i][j] = sum;
            }
        }


        System.out.println();
        System.out.print("a \t");

        for (int i = 0; i < k; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + "\t");
            for (int j = 0; j < k; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.print("b \t");

        for (int i = 0; i < m; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < k; i++) {

            System.out.print(i + "\t");
            for (int j = 0; j < m; j++) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println();
        System.out.print("p \t");

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + "\t");
            for (int j = 0; j < m; j++) {

                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
