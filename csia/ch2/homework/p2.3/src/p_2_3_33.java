import edu.princeton.cs.algs4.StdDraw;

public class p_2_3_33 {


    final private static double rightBranchAngle = -45;
    final private static double middleBranchAngle = 0;
    final private static double leftBranchAngle = 45;

    final private static double penRadiusScale = 0.7;
    final private static double lengthScale = 0.65;

    final private static double branchAngle = 15;

    public static void branch(int n, double x, double y, double length, double angle, double penRadius)
    {
        if (n == 0) return;

        double x1 = x + length * Math.cos(Math.toRadians(rightBranchAngle + angle + branchAngle));
        double y1 = y + length * Math.sin(Math.toRadians(rightBranchAngle + angle + branchAngle));

        double x2 = x + length / 1.5 * Math.cos(Math.toRadians(middleBranchAngle + angle + branchAngle));
        double y2 = y + length / 1.5 * Math.sin(Math.toRadians(middleBranchAngle + angle + branchAngle));

        double x3 = x + length * Math.cos(Math.toRadians(leftBranchAngle + angle + branchAngle));
        double y3 = y + length * Math.sin(Math.toRadians(leftBranchAngle + angle + branchAngle));

        angle += branchAngle;

        StdDraw.setPenRadius(penRadius);
        StdDraw.line(x,  y,  x1, y1);
        branch(n - 1, x1, y1,
               length * lengthScale,
               angle + rightBranchAngle,
               penRadius * penRadiusScale);

        StdDraw.setPenRadius(penRadius);
        StdDraw.line(x,  y,  x2, y2);
        branch(n - 1, x2, y2,
                length / 1.5 * lengthScale,
               angle + middleBranchAngle,
               penRadius * penRadiusScale);

        StdDraw.setPenRadius(penRadius);
        StdDraw.line(x,  y,  x3, y3);
        branch(n - 1, x3, y3,
               length * lengthScale,
               angle + leftBranchAngle,
               penRadius * penRadiusScale);

    }

    public static void tree(int n)
    {
        double length = 1;

        StdDraw.setPenRadius(0.01);
        StdDraw.line(0.5, 0, 0.5, 0.20);

        branch(n,0.5, 0.20, 0.20 / 2.5, 90, 0.007);
        /*if (n > 1) {
            tree(n - 1,0, 0, length / 2.0);
        }*/
    }

    public static void tree(int n, double x, double y, double length)
    {
        if (n <= 0) return;


        /*
        triangle(x, y, length);
        tree(n - 1, x, y, length / 2);

        triangle(x + length, y, length);
        tree(n - 1, x + length, y, length / 2);

        triangle(x + length / 2.0, y + triangleHeight(length), length);
        tree(n - 1, x + length / 2.0, y + triangleHeight(length), length/ 2);*/
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        tree(n);
    }
}
