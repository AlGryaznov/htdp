public class ex1_3_2 {

    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);


        double D = b * b - 4.0 * c;

        if (D < 0) {

            System.out.println("D is less than zero");

        } else if (a == 0) {

            System.out.println("Division by zero");

        } else {
            D = Math.sqrt(D);
            System.out.println("x1 = " + (-b + D) / (2.0 * a));
            System.out.println("x2 = " + (-b - D) / (2.0 * a));
        }

    }
}
