public class p_1_5_8 {

    /*
     * Среднее геометрическое
     * g = (x1 * x2 * x3 * ... * xn) ^ (1/n) = y ^ (1/n)
     * loge(bc) = loge(b) + loge(c) = x
     * y = e ^ x = bc
     * g = y ^ (1/n) = a ^ (x/n)
     *
     */

    public static void main(String[] args) {

        double x = 0;
        double geom = 0;
        double harm = 0;
        int n = 0;

        while (!StdIn.isEmpty()) {


            x = StdIn.readDouble();
            harm += 1/x;
            geom += Math.log(x);

            n++;
        }
        StdOut.println("average harm - " + n/harm);
        StdOut.println("average geom - " + Math.exp(geom/n));
    }
}
