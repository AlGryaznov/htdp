public class p_1_4_13 {
    public static void main(String[] args) {

        int[][] a;
        int[][] b;

        a = fillArray(3,3, false);
        showArray(a);
        b = solutionA(a);
        showArray(b);

        a = fillArray(3,5, false);
        showArray(a);
        b = solutionB(a);
        showArray(b);

        a = fillArray(3,5, true);
        showArray(a);
        b = solutionC(a);
        showArray(b);

    }

    public static int[][] fillArray(int n, int m, boolean isRandomizeSize) {

        int[][] a = new int[n][];

        for (int i = 0; i < n; i++) {

            int k = 0;

            if (isRandomizeSize) k = 1 + (int)(Math.random() * 9);
            else                 k = m;

            a[i] = new int[k];

            for (int j = 0; j < k; j++) {

                a[i][j] = (int)(Math.random() * 10);
            }
        }
        return a;
    }

    public static void showArray(int[][] a) {

        int n = a.length;

        System.out.print("  ");

        int k = a[0].length;

        for (int i = 0; i < n; i++) {

            int t = a[i].length;

            if (k < t) k = t;
        }

        for (int i = 0; i < k; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
            int m = a[i].length;

            for (int j = 0; j < m; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] solutionA(int[][] a) {

        int n = a.length;

        int[][] b = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                b[i][j] = a[i][j] ;
            }
        }
        return b;
    }

    public static int[][] solutionB(int[][] a) {

        int n = a.length;
        int m = a[0].length;

        int[][] b = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                b[i][j] = a[i][j];
            }
        }

        return b;
    }

    public static int[][] solutionC(int[][] a) {

        int n = a.length;
        int[][] b = new int[n][];

        for (int i = 0; i < n; i++) {

            int m = a[i].length;
            b[i] = new int[m];

            for (int j = 0; j < m; j++) {

                b[i][j] = a[i][j];
            }
        }

        return b;
    }
}
