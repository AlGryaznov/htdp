public class p_2_1_21 {

    public static int[][] multiply(int[][] m1, int[][] m2)
    {
        int k = m2.length;

        if (k != m1[0].length)
            return null;

        int n = m1.length;
        int m = m2[0].length;;


        int[][] p = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int sum = 0;
                for (int l = 0; l < k; l++) {

                    sum += m1[i][l] * m2[l][j];
                }
                p[i][j] = sum;
            }
        }
        return p;
    }


    public static void printa(int[][] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] m1;
        m1 = new int[n][k];
        int[][] m2;
        m2 = new int[k][m];
        int[][] p = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {

                int r = (int)(Math.random() * 10);
                m1[i][j] = r;
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {

                int r = (int)(Math.random() * 10);
                m2[i][j] = r;
            }
        }
        printa(m1);
        System.out.println();
        printa(m2);
        System.out.println();

        printa(multiply(m1, m2));
    }
}
