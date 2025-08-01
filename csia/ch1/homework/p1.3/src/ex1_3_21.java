public class ex1_3_21 {

    public static void main(String[] args) {

        long i = Long.parseLong(args[0]);
        int  k = Integer.parseInt(args[1]);
        int  power = 1;

        while (power <= i/k) {
            power = k * power;
        }

        while (power > 0) {

            if (i < power) {
                System.out.print(0);
            }
            else {
                long x = i/power;

                if (x > 9) {

                    System.out.print((char)(55 + x));

                } else {

                    System.out.print(x);
                }

                i -= power * x;
            }

            power /=k;
        }
    }
}


