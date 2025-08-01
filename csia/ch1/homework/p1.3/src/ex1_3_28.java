public class ex1_3_28 {

    public static void main(String[] args) {

        long n = Long.parseLong(args[0]);
        long prev = 1;

        //for (long factor = 2; factor < n; factor++) {

        for (long factor = 2; factor <= n / factor; factor++) {

            while (n % factor == 0) {


                n /= factor;

                if (prev != factor) {
                    System.out.print(factor + " ");
                }
                prev = factor;
            }
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
