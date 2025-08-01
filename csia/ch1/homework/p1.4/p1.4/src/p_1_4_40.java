public class p_1_4_40 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        int[] b = new int[n];

        int m = 0;
        for (int i = 0; i < n; i++) {

            m += (int)Math.floor(0.5 + Math.random());
            a[i] = i + 1;
        }

        int n1 = m;
        int n2 = n - m;
        int i = 0;
        int j = i;
        int k = m;
        while ((n1 != 0) && (n2 != 0)) {

            double r = Math.random();
            double p = ((double) n1) / (n1 + n2);
            System.out.println(p);

            if ((n1 > 0) && (p > r)) {

                System.out.print("n1 ");
                b[i] = a[j];
                j++;
                n1--;

            } else {

                System.out.print("n2 ");
                b[i] = a[k];
                k++;
                n2--;
            }
            i++;
        }

        int h = 0;
        int o = 0;
        if (n2 == 0) {
            o = j;
            h = m;
        } else {
            o = k;
            h = n;
        }

        while (o < h) {

            b[i] = a[o];
            i++;
            o++;
        }

        for (int l = 0; l < n; l++) {

            System.out.print(a[l] + " ");
        }
        System.out.println();

        for (int l = 0; l < n; l++) {

            System.out.print(b[l] + " ");
        }
        System.out.println();

    }
}
