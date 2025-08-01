public class ex1_3_8 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        final String postfixSt = "st";
        final String postfixNd = "nd";
        final String postfixRd = "rd";
        final String postfixTh = "th";
        String s = postfixSt;

        n = n % 1000;

        int i = 1;
        while (i <= n)
        {
            int u = i % 10;
            int d = i % 100;

            if ((d > 9) && (d < 14)) {

                s = postfixTh;
            }
            else {
                if (u == 1)         s = postfixSt;
                else if (u == 2)    s = postfixNd;
                else if (u == 3)    s = postfixRd;
                else                s = postfixTh;
            }

            System.out.println(i + s + " Hello");
            i += 1;
        }
    }
}
