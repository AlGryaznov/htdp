public class p_2_1_5 {

    public static void main(String[] args)
    {
        System.out.printf("%b\n", areTriangular(3, 4, 5));
        System.out.printf("%b\n", areTriangular(2, 1, 3));
        System.out.printf("%b\n", areTriangular(2, 1, 6));
    }


    public static boolean areTriangular(double a, double b, double c)
    {
        long x1 = ((long) (c - a - b));
        long x2 = ((long) (a - b - c));
        long x3 = ((long) (b - a - c));

        x1 = (x1 == 0) ? -1 : x1;
        x2 = (x2 == 0) ? -1 : x2;
        x2 = (x2 == 0) ? -1 : x2;

        long x = x1 & x2 & x3;

        return x < 0;
    }

}
