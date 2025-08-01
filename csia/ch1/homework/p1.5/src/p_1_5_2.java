public class p_1_5_2 {

    public static void main(String[] args) {

        int min = StdIn.readInt();
        int max = min;

        while(!StdIn.isEmpty()) {

            int v = StdIn.readInt();

            if (v <= 0) {

                StdOut.println("Input value must be positive");

            } else {

                if (v < min) {
                    min = v;
                }
                if (v > max) {
                    max = v;
                }
            }
        }
        StdOut.println("min = " + min);
        StdOut.println("max = " + max);
    }
}
