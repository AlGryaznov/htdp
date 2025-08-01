public class ex1_3_38 {

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double sum = 0.0;
        double a = 1.0;

        for (int i = 1; sum != sum + a; i++) {

            sum += a;
            a *= x/i;
        }

        System.out.println("sum = " + sum);
        System.out.println("e^x = " + Math.exp(x));
    }
}
