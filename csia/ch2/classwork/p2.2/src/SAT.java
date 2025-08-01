public class SAT {
    public static void main(String[] args) {

        double z = Double.parseDouble(args[0]);
        double nu = Double.parseDouble(args[1]);
        double sigma = Double.parseDouble(args[2]);
        double v = Gaussian.cdf((z - nu) / sigma);

        System.out.println(v);
    }
}