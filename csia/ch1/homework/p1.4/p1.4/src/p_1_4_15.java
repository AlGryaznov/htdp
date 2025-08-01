public class p_1_4_15 {
    public static void main(String[] args) {

        int[][] a;

        a = fillArray(4,4, false);
        showArray(a);
        a = transpose(a);
        showArray(a);
    }
    public static int[][] transpose(int[][] a) {

        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                //System.out.println( "i = " + i + ", j = " + j);

                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;

                //showArray(a);
            }
        }
        return a;
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
}
