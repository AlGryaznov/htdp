public class ex1_3_34BAD {

    public static void main(String[] args) {

        long n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {

                        long a = i*i*i + j*j*j;
                        long b = k*k*k + l*l*l;

                        if (a > n) {
                            break;
                        }
                        else if (a == b) {

                            System.out.println(i + " " + j + " " + k + " " + l + " ");

                            System.out.println(a);
                        }

                    }
                }
            }
        }
    }
}
