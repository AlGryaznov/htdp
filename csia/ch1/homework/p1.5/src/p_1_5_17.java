public class p_1_5_17 {

    public static void main(String[] args) {

        double avgModule = 0;
        double avgSquare = 0;
        double numOfTrans = 0;
        double prev = 0;
        int n = 0;

        double x = StdIn.readDouble();
        avgModule += Math.abs(x);
        avgSquare += x*x;
        prev = x;

        while (!StdIn.isEmpty()) {

            x = StdIn.readDouble();

            avgModule += Math.abs(x);
            avgSquare += x*x;

            if ((prev * x) < 0) {

                prev = x;
                numOfTrans++;
            }
            n++;
        }

        StdOut.println("average module - " + avgModule/n);
        StdOut.println("average square - " + avgSquare/n);
        StdOut.println("number of transitions - " + numOfTrans);
    }
}