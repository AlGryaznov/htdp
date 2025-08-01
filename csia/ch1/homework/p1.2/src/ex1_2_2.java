public class ex1_2_2 {

    public static void main(String[] args) {

        double theta = Integer.parseInt(args[0]);

        double c = Math.cos(theta);
        double s = Math.sin(theta);


        System.out.println(c*c + s*s);

    }
}
