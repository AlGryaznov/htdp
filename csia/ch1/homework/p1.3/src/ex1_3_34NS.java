public class ex1_3_34NS {

    public static void main(String[] args) {

        long n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    for (int l = 0; l <= n; l++) {

                        int a = i*i*i + j*j*j;
                        int b = k*k*k + l*l*l;

                        if (a > n) {
                            break;
                        }
                        else if (a == b) {

                            System.out.println(a);
                        }

                    }
                }
            }
        }
    }
}
