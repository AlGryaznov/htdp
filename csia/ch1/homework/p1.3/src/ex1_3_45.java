public class ex1_3_45 {

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        r = 3.5;
        for (int i = 0; i < t; i++) {

             x = r * x * (1.0 - x);
        }
        System.out.println("r = " + r + ",x = "  + x);

        r = 3.8;
        for (int i = 0; i < t; i++) {

            x = r * x * (1.0 - x);
        }
        System.out.println("r = " + r + ",x = "  + x);

        r = 4;
        for (int i = 0; i < t; i++) {

            x = r * x * (1.0 - x);
        }
        System.out.println("r = " + r + ",x = "  + x);
    }
}
