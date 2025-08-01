public class p_1_4_28 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int[] b = new int[n];
        int[] a;
        a = new int[n];

        for (int i = 0; i < a.length; i++) {

            a[i] = i;
            //System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n; i++) {

            int r = (int)(Math.random() * n);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }

        for (int i = 0; i < n; i++) {

            b[a[i]] = i;
        }


        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i] + " ");
        }
        System.out.println();

    }
}