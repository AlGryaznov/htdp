public class p_1_4_21 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        long totalLength = 0;
        long totalArea = 0;

        for (int t = 0; t < trials; t++) {

            boolean[][] a = new boolean[n][n];
            boolean isDeadEnd = false;
            int x = n/2, y = n/2;

            int top = n + 1;
            int bottom = -1;
            int left = n + 1;
            int right = - 1;

            long length = 0;
            while (x > 0 && x < n - 1 && y > 0 && y < n - 1)
            {
                length++;
                a[x][y] = true;
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]) {
                    isDeadEnd = true;
                    break;
                }
                double r = Math.random();
                if      (r < 0.25) { if (!a[x+1][y]) x++; }
                else if (r < 0.50) { if (!a[x-1][y]) x--; }
                else if (r < 0.75) { if (!a[x][y+1]) y++; }
                else if (r < 1.00) { if (!a[x][y-1]) y--; }
            }
            if (isDeadEnd) {
                System.out.println(length + " deadend path length");
                deadEnds++;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if (a[i][j]) {

                            left = Math.min(left, j);
                            right = Math.max(right, j);

                            top = Math.min(top, i);
                            bottom = Math.max(bottom, i);
                        }
                    }
                }

                System.out.println("left - " + left + ", right - " +  right);
                System.out.println("top - " + top + ", bottom - " +  bottom);

                long area = (long)(bottom - top + 1) * (right - left + 1);


                totalArea += area;

                System.out.println("area - " + area);
                System.out.println();
                System.out.print("a ");

                for (int i = 0; i < n; i++) {

                    System.out.print(i + " ");
                }
                System.out.println();

                for (int i = 0; i < n; i++) {

                    System.out.print(i + " ");
                    for (int j = 0; j < n; j++) {

                        if (a[i][j]) System.out.print("* ");
                        else         System.out.print("  ");
                    }
                    System.out.println();
                }


            } else {
                System.out.println(length + " escape path length");
            }

            totalLength += length;
        }

        System.out.println(totalLength/trials + " avg path length");
        System.out.println(totalArea/deadEnds + " avg area");
        System.out.println(100 * deadEnds/trials + "% dead ends");

    }
}
