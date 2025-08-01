public class p_1_4_16 {
    public static void main(String[] args) {

        //нет выделение памяти под массив

        int n = Integer.parseInt(args[0]);
        boolean[][] a = new boolean[n][n];


        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = true;
            }
        } */


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

                    /*
                    boolean isNoCommonDiv = true;
                    int l = 0;

                    if (i > j)  l = i;
                    else        l = j;

                    for (int k = 2; k < l; k++) {

                        if (isPrime[k]) {

                            if ((i % k == 0) && (j % k == 0)) {

                                isNoCommonDiv = false;
                                break;
                            }
                        }
                    }
                    a[i][j] = isNoCommonDiv;

                    if (isNoCommonDiv)
                        System.out.println("i=" + i + ", j = " + j);*/
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


        // Show result
        System.out.print(" \t");

        for (int i = 0; i < n; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(i + "\t");
            for (int j = 0; j < n; j++) {

                if (a[i][j]) System.out.print("* ");
                else         System.out.print("  ");
            }
            System.out.println();
        }
    }
}
