public class ex1_3_33 {

    public static void main(String[] args) {

        double x = 0;
        double y = 0;

        do {
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;

        } while (x*x + y*y > 1.0);

        System.out.println("x = " + x + ", y = " + y);

        System.out.println("a = " + (2 * x * Math.sqrt(1 - x*x - y*y)));
        System.out.println("b = " + (2 * Math.sqrt(1 - x*x - y*y)));
        System.out.println("c = " + (1 - 2 * (1 - x*x - y*y)));
    }
}
