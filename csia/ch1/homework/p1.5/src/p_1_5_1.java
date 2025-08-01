public class p_1_5_1 {

    public static void main(String[] args) {

        int min = StdIn.readInt();
        int max = min;

        while(!StdIn.isEmpty()) {

            int v = StdIn.readInt();

            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }
        StdOut.println("min = " + min);
        StdOut.println("max = " + max);
    }
}