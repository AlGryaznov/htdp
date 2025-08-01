public class p_2_1_6 {

    public static void main(String[] args)
    {
        System.out.printf("sigmoid(%.2f) = %.4f", 1.4, sigmoid(1.4));
    }

    public static double sigmoid(double x)
    {
        return 1/(1+Math.exp(-x));
    }
}
