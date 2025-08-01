public class ex1_3_6 {

    public static void main(String[] args) {

        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        if ((velocity < 3) && (velocity > 120)) {

            System.out.println("velocity must be in range [3; 120]");

        } else if (temperature > 50){

            System.out.println("temperature must be less 50");

        } else {

            double w =  35.74 + 0.6215*temperature + (0.42758*temperature - 35.75) * Math.pow(velocity, 0.16);
            System.out.println("result " + w);
        }



    }
}
