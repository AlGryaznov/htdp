public class ex1_3_17 {

    public static void main(String[] args) {

        int P = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);

        for (int i = 0; i < 25; i++) {
            double result = P * Math.pow(Math.E, r * i);
            System.out.println(result);
        }
    }
}
