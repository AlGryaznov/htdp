public class p_1_5_12 {

    public static void main(String[] args) {

        while (!StdIn.isEmpty()) {

            String[] s = StdIn.readLine().split(" ");

            double x = Double.parseDouble(s[1]) / Double.parseDouble(s[2]);

            StdOut.printf("%5s %5s %5s %10.3f\n", s[0], s[1], s[2], x);
        }
    }
}
