public class p_1_4_30 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] a;
        a = new int[n];
        boolean[] b = new boolean[n];
        boolean isRumorsSpread = true;
        int count = 0;


        System.out.println();

        for (int k = 0; k < trials; k++) {

            isRumorsSpread = true;

            for (int i = 0; i < a.length; i++) {

                a[i] = i;
                b[i] = false;
            }

            a[0] = 0;
            int r = 1 + (int)(Math.random() * (n - 1));
            int temp = a[1];
            a[1] = a[r];
            a[r] = temp;

            b[a[0]] = true;
            b[a[1]] = true;

            for (int i = 2; i < n; i++) {

                r = 2 + (int)(Math.random() * (n - 2));

                if (b[a[r]]) {

                    //System.out.println("depth " + i);
                    isRumorsSpread = false;
                    break;
                }

                b[a[r]] = true;
                temp = a[0];
                a[0] = a[1];
                a[1] = a[r];
                a[r] = temp;
            }



            if (isRumorsSpread)
                count++;

            /*
            for (int i = 0; i < a.length; i++) {

                System.out.print(a[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < b.length; i++) {

                System.out.print(b[i] + " ");
            }
            System.out.println();
            */
        }

        System.out.println("count " + count + " of " + trials);
        System.out.println("probability " + (double)count/trials);
    }
}
