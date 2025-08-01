public class Quadratic {

    public static void main(String[] args) {

        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double D = Math.sqrt(b * b - 4.0 * c);

        System.out.println((-b + D) / 2.0);
        System.out.println((-b - D) / 2.0);
    }
}
