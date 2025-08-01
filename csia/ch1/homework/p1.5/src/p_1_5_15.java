public class p_1_5_15 {

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double minDistance = Integer.MAX_VALUE;

        while (!StdIn.isEmpty()) {

            double xi = StdIn.readDouble();
            double yi = StdIn.readDouble();
            double zi = StdIn.readDouble();

            xi = x - xi;
            yi = y - yi;
            zi = z - zi;

            double distance = xi * xi + yi * yi + zi * zi;

            if (distance < minDistance) {

                minDistance = distance;
            }

            StdOut.println("distance - " + distance);
        }

        StdOut.println("minDistance - " + minDistance);
    }
}
