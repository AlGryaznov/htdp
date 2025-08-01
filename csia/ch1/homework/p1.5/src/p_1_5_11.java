public class p_1_5_11 {

    public static void main(String[] args) {

        int count = 0;

        while (!StdIn.isEmpty()) {

            StdOut.println(StdIn.readString());
            count++;
        }

        StdOut.println("total number of words - " + count);
    }
}
