public class p_2_1_9 {
    public static void main(String[] args)
    {
        System.out.printf("log2(%d) = %.2f\n", 64, lg(64));
        System.out.printf("log2(%d) = %.2f\n", 57, lg(57));
    }

    public static double lg(double n) {

        return Math.log(n) / Math.log(2);
    }
}
