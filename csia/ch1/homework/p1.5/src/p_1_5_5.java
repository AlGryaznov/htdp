public class p_1_5_5 {

    public static void main(String[] args) {

        int cur = 0;
        int prev = 0;
        int count = 0;
        int seqVal = 0;
        int seqCount = 0;

        while (!StdIn.isEmpty()) {

            cur = StdIn.readInt();
            count = (cur == prev) ? count + 1 : 1;

            if (seqCount < count) {

                seqVal = cur;
                seqCount = count;
            }

            prev = cur;
        }

        StdOut.printf("Longest run: %d consecutive %ds» ", seqCount, seqVal);
    }
}
