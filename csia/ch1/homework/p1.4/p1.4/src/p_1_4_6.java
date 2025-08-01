public class p_1_4_6 {
    public static void main(String[] args) {
        //нет выделение памяти под массив

        int n = Integer.parseInt(args[0]);
        boolean[][] a = new boolean[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = true;
            }
        }

        System.out.print("  ");

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
            for (int j = 0; j < n; j++) {

                if (a[i][j]) System.out.print("* ");
                else         System.out.print("  ");
            }
            System.out.println();
        }
    }
}
