import java.awt.*;

public class p2_4_1 {


    public static boolean[][] interPrimes(int n)
    {
        boolean[][] a = new boolean[n][n];

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n ; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n/i ; i++) {

            if (isPrime[i]) {

                for (int j = i; j <= n/i; j++) {

                    isPrime[i * j] = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(isPrime[i] + " ");
        }
        System.out.println();

        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {

                if (i == j) continue;

                if (isPrime[i] && isPrime[j]) {

                    a[i][j] = true;

                } else if (isPrime[i] || isPrime[j]) {

                    if (i > j) a[i][j] = !((i % j) == 0);
                    else       a[i][j] = !((j % i) == 0);

                } else {

                    int x = i;
                    int y = j;

                    do {
                        int r = x % y;

                        if (r == 0) {
                            break;
                        }
                        x = y;
                        y = r;

                    } while(true);

                    a[i][j] = (y == 1);
                }
            }
        }
        return a;
    }

    public static void show(boolean[][] a, boolean which)
    {
        int n = a.length;
        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(-1, n);
        StdDraw.setPenColor(Color.GRAY);
        StdDraw.filledSquare(-1, -1, (n+1));
        StdDraw.setPenColor(Color.BLACK);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (a[i][j] == which) {
                    Color c = StdDraw.getPenColor();
                    StdDraw.setPenColor(Color.WHITE);
                    StdDraw.filledSquare(j, n-i-1, 0.5);
                    StdDraw.setPenColor(c);
                    StdDraw.filledSquare(j, n-i-1, 0.48);

                } else {
                    Color c = StdDraw.getPenColor();
                    StdDraw.setPenColor(Color.WHITE);
                    StdDraw.filledSquare(j, n-i-1, 0.5);
                    StdDraw.setPenColor(c);
                }
            }
        }
    }

    public static boolean[][] ademar(int n)
    {
        boolean[][] a;
        a = new boolean[n][n];
        int[][] b = {{0,0}, {0,1}, {1,0}, {1, 1}};

        a[0][0] = true;
        if (n == 1) {
            return a;
        }



        for (int m = 1; m < n; m = m + m) {
            for (int k = 1; k < 4; k++ ) {

                int i = m * b[k][0];
                int j = m * b[k][1];

                for (int l = 0; l < m; l++) {
                    for (int o = 0; o < m; o++) {

                        a[i + l][j + o] = (b[k][0] == b[k][1]) != a[l][o];
                    }
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {

        show(interPrimes(16), false);
       //show(ademar(16), true);
    }
}