public class ex1_2_31 {
    public static void main(String[] args) {

        double l0 = Math.toRadians(Double.parseDouble(args[0]));
        double l = Math.toRadians(Double.parseDouble(args[1]));
        double ph = Math.toRadians(Double.parseDouble(args[1]));

        double x = l - l0;
        double y = 0.5 * Math.log((1 + Math.sin(ph)) / (1 - Math.sin(ph)));

        System.out.println("x = " + x + "; y = " + y);

    }
}