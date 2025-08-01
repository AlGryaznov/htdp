public class p_1_4_27 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            a[i] = 1 + (int)(Math.random() * n);
        }

        for (int i = 1; i < n; i++) {

            int r = i + (int)(Math.random() * (n - i));

            int x = a[i - 1];
            a[i - 1] = a[r];
            a[r] = x;
        }

        /*for (int i = 2; i < n; i++) {

            if ((a[i - 2] > a[i - 1]) && (a[i - 1] < a[i])) {
                count++;
            }
        }*/

        boolean left = false;
        boolean right = false;
        for (int i = 1; i < n; i++) {

            if (a[i - 1] > a[i]) {
                left = true;

            } else if (a[i - 1] < a[i]) {

                if (left) {
                    count++;
                    left = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("left-right minimuma - " + count);
    }
}
