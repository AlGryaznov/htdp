public class p_1_5_6 {

    public static void main(String[] args) {

        int cur = 0;
        int prev = 0;

        while (!StdIn.isEmpty()) {

            cur = StdIn.readInt();

            if (prev != cur) {

                StdOut.print(cur + " ");
            }

            prev = cur;
        }
    }
}
