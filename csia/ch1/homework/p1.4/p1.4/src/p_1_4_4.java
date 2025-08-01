public class p_1_4_4 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int[] a;
        a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = (int) (Math.random() * 100);
            System.out.print("a["+ i +"] = " +  a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n / 2; i++) {


            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {

            System.out.print("a["+ i +"] = " +  a[i] + " ");
        }
    }
}
