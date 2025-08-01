public class ex1_2_18 {

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double distance = Math.sqrt(x * x + y * y);

        System.out.println("distance = " + distance);
    }
}
