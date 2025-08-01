public class p_1_4_26 {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[][] b = new int[m][m];
        int[] a;
        a = new int[m];
        int count = 0;

        for (int k = 0; k < n; k++) {

            for (int i = 0; i < a.length; i++) {

                a[i] = i;
            }

            for (int i = 0; i < m; i++) {

                int r = (int)(Math.random() * m);
                int temp = a[i];
                a[i] = a[r];
                a[r] = temp;
            }

            /*
            for (int i = 0; i < a.length; i++) {

                System.out.print(a[i] + " ");
            }
            System.out.println();
            */

            int i = 1;
            while ((i < m) && (Math.abs(a[i-1] - a[i]) > 1)) {
                i++;
            }
            if ((i == m) && (Math.abs(a[i - 1] - a[0]) > 1)) {
                count++;
            }

        }
        System.out.println("count " + count + " of " + n);
        System.out.println("probability " + Math.round(((double) count)/n * 100) + "%");
    }
}
