public class ex1_2_25 {

    public static void main(String[] args) {

        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        double w =  35.74 + 0.6215*temperature + (0.42758*temperature - 35.75) * Math.pow(velocity, 0.16);

        System.out.println("result " + w);

    }
}