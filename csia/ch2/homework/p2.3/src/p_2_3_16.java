public class p_2_3_16 {

    public static void divide_canvas(int n)
    {
        divide_canvas_vertically(n, 0, 0, 1, 1);
    }

    public static void divide_canvas_vertically(
            int n,
            double x0,
            double y0,
            double width,
            double height)
    {
        if (n <= 0) return;

        width = width / 2.0;
        double x = x0 + width;
        n--;

        StdDraw.line(x, y0, x, y0 + height);

        divide_canvas_horizontally(n, x0, y0, width, height);
        divide_canvas_horizontally(n, x, y0, width, height);
    }

    public static void divide_canvas_horizontally(
            int n,
            double x0,
            double y0,
            double width,
            double height)
    {
        if (n <= 0) return;

        height = height / 2.0;
        double y = y0 + height;
        n--;

        StdDraw.line(x0, y, x0 + width, y);

        divide_canvas_vertically(n, x0, y0, width, height);
        divide_canvas_vertically(n, x0, y, width, height);
    }


    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        divide_canvas(n);
    }
}
