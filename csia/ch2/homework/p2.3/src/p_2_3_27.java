import edu.princeton.cs.algs4.StdDraw;

public class p_2_3_27 {


    public static double triangleHeight(double side)
    {
        return side * (Math.sqrt(3) / 2.0);
    }

    public static void triangle(double x, double y, double length)
    {
        double h = triangleHeight(length);

        double x1 = x + length / 2.0;
        double y1 = y + h;
        double x2 = x + length;

        StdDraw.line(x,  y,  x1, y1);
        StdDraw.line(x1, y1, x2, y);
        StdDraw.line(x2, y, x, y);
    }

    public static void serpinkski(int n)
    {
        double length = 1;
        triangle(0, 0, length);
        if (n > 1) {
            serpinkski(n - 1,0, 0, length / 2.0);
        }
    }

    public static void serpinkski(int n, double x, double y, double length)
    {
        if (n <= 0) return;
        triangle(x, y, length);
        serpinkski(n - 1, x, y, length / 2);

        triangle(x + length, y, length);
        serpinkski(n - 1, x + length, y, length / 2);

        triangle(x + length / 2.0, y + triangleHeight(length), length);
        serpinkski(n - 1, x + length / 2.0, y + triangleHeight(length), length/ 2);
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        serpinkski(n);
    }
}
