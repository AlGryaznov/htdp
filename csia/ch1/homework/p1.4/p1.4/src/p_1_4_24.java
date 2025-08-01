public class p_1_4_24 {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[][] b = new int[m][m];
        int[] a;
        a = new int[m];

        for (int k = 0; k < n; k++) {

            for (int i = 0; i < a.length; i++) {

                a[i] = i;
                //System.out.print(a[i] + " ");
            }

            for (int i = 0; i < m; i++) {

                int r = i + (int)(Math.random() * (m - i));
                int temp = a[i];
                a[i] = a[r];
                a[r] = temp;
                b[a[i]][i]++;
                //b[a[r]][r]++;
            }
            /*
            for (int i = 0; i < a.length; i++) {

                System.out.print(a[i] + " ");
            }
            System.out.println();*/
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {

            System.out.print("Number is " + i+ " " + "of " + n + " times ");

            for (int j = 0; j < b[i].length; j++) {

                /*double p = ((double)(b[i][j])) / trials;
                System.out.print(p + " ");*/
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
