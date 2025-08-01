public class ex1_3_39 {

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);

        System.out.println("sum = " + sin(x));
        System.out.println("sin(x) = " + Math.sin(x));


        System.out.println("sum = " + cos(x));
        System.out.println("cos(x) = " + Math.cos(x));
    }



    public static double sin(double x) {

        double sum = 0.0;
        double elem = x;
        double dx = x * x;
        double sign = 1;

        for (int i = 2; sum != sum + elem; i+=2) {

            sum += sign * elem;
            sign *= -1;
            elem *= dx/(i * (i + 1));
        }

        return sum;
    }

    public static double cos(double x) {

        double sum = 0.0;
        double elem = 1;
        double dx = x * x;
        double sign = 1;

        for (int i = 2; sum != sum + elem; i+=2) {

            sum += sign * elem;
            sign *= -1;
            elem *= dx/(i * (i - 1));
        }

        return sum;
    }

}
