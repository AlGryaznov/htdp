import percolation.Percolation;

public class p2_4_2 extends Percolation {

    public static void print(boolean[][] isOpen, boolean[][] isFull)
    {
        int n = isOpen.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if      (isFull[i][j])  StdOut.print("*");
                else if (isOpen[i][j])  StdOut.print("0");
                else                    StdOut.print("1");
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        boolean[][] isOpen = random(n, p);//StdArrayIO.readBoolean2D();
        boolean[][] isFull = flow(isOpen);

        StdDraw.setPenColor(StdDraw.BLACK);
        show(isOpen, false);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        show(isFull, true);

        print(isOpen, isFull);

    }
}
