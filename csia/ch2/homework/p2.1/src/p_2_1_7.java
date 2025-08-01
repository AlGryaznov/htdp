public class p_2_1_7 {

    public static double sqrt(double c)
    {
        double EPSILON = 1e-15;
        double t = c;

        while(Math.abs(t - c/t) > EPSILON)
        {
            t = (c/t + t) /2.0 ;
        }
        return t;
    }

    public static void main(String[] args)
    {
        double c = Double.parseDouble(args[0]);
        System.out.println(sqrt(c));
    }
}
