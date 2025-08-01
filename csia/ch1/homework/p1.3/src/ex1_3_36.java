public class ex1_3_36 {

    public static void main(String[] args) {

        long n = Long.parseLong(args[0]);
        long count = 1;

        if (n <= 0) {
            System.out.println("Error, n must be above 0");
            return;

        } else if (n <= 2) {
            //System.out.println(" p = " + 2);
            return;
        }

        for (long i = 3; i <= n; i++) {

            if (i % 2 == 0) {
                continue;
            }

            boolean isPrime = true;

            //System.out.print("i = " + i + " ");
            for (long factor = 3; factor <= i / factor; factor++) {

                long x = i;
                long y = factor;
                //System.out.println("x = " + x + " y = " + y);

                do {
                    long r = x % y;

                    if (r == 0) {
                        break;
                    }
                    x = y;
                    y = r;

                } while(true);

                if (y != 1) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                count++;
                //System.out.println(" p = " + i);
            }

        }

        System.out.println("\n" + count);
    }
}
