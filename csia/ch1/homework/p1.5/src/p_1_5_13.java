public class p_1_5_13 {
    public static void main(String[] args) {

        int P = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        double r = Double.parseDouble(args[2]);

        double total = P * Math.pow(Math.E, r * t);
        int months = 12 * t;
        double payment = Math.floor(total / (12 * t));

        System.out.printf("P = %d, t = %d, r = %.4f\n", P, t, r);
        System.out.println("total " + total);
        System.out.println("payment " + payment);


        double left = total;
        for (int i = 1; i < months; i++) {

            left -= payment;
            System.out.printf("%6.2f %10.2f %10.2f%%\n", payment, left - payment, (total - left) / total * 100);
        }
        System.out.printf("%6.2f %10.2f %10.2f%%\n",
                total - payment * months,
                0.0,
                100.0);


    }
}
