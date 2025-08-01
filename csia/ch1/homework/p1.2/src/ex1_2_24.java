public class ex1_2_24 {
    public static void main(String[] args) {

        int P = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        double r = Double.parseDouble(args[2]);

        double result = P * Math.pow(Math.E, r * t);

        System.out.println("result " + result);
    }
}
