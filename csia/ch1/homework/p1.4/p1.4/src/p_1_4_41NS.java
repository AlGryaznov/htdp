public class p_1_4_41NS {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double[][] a = new double[n][n];


        a[1][1] = 1.0;


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                a[i][j] = (a[i - 1][j] +  a[i - 1][j - 1]) / 2.0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
