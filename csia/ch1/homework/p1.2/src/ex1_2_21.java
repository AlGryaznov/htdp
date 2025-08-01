public class ex1_2_21 {

    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double v = Math.sin(2*a) + Math.sin(3*a);

        System.out.println("sin(2 * " + a + ") + " + "sin(3 * " + a + ") = " + v);
    }
}
