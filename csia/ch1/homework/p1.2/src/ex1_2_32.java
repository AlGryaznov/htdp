public class ex1_2_32 {

    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        System.out.println("rgb (" + r + "," + g + "," + b + ")");
        double x = Math.max(r, Math.max(g, b));

        r = Math.max(r, 1);
        g = Math.max(g, 1);
        b = Math.max(b, 1);

        double k = 1 - x / 255;
        x = Math.max(x, 1);
        double c = 1 - r / x;
        double m = 1 - g / x;
        double y = 1 - b / x;

        System.out.println("cmyk (" + c + "," + m + "," + y + "," + k + ")");
    }
}