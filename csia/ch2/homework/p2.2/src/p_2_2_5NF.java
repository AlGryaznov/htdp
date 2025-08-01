public class p_2_2_5NF {

    private static int trials = 0;


    public static void testUniformDouble()
    {
        testUniformDoubleNoArgs();
        testUniformDouble2Args(0.5, 3.5);
        testUniformDouble2Args(-1.5, 3.5);
    }

    public static void testUniformDoubleNoArgs()
    {
        boolean result = false;
        double prev = StdRandom.uniformDouble();

        for (int i = 1; i < trials; i++) {

            double  cur = StdRandom.uniformDouble();
            boolean isInRange = (cur >= 0) && (cur < 1);
            result = isInRange;

            if (!isInRange) {
                break;
            }
        }
        StringBuilder s = new StringBuilder();
        if (result) s.append("passed");
        else        s.append("didn't pass");

        StdOut.printf("testUniformDouble() is %s\n", s.toString());
    }

    public static void testUniformDouble2Args(double min, double max)
    {
        boolean result = false;
        double prev = StdRandom.uniformDouble(min,max);

        for (int i = 1; i < trials; i++) {

            double  cur = StdRandom.uniformDouble(min,max);
            boolean isInRange = (cur >= min) && (cur < max);
            result = isInRange;

            if (!isInRange) {
                break;
            }
        }
        StringBuilder s = new StringBuilder();
        if (result) s.append("passed");
        else        s.append("didn't pass");

        StdOut.printf("testUniformDouble(%.3f, %.3f) is %s\n", min, max, s.toString());
    }

    public static void testUniformInt()
    {
        testUniformInt1Args();
        testUniformInt2Args();
    }

    public static void testUniformInt1Args()
    {
        boolean result = false;
        int min = 0;
        int max = 10;
        int prev = StdRandom.uniformInt(max);

        for (int i = 1; i < trials; i++) {

            int  cur = StdRandom.uniformInt(max);
            boolean isSame = prev == cur;
            boolean isInRange = (cur >= min) && (cur < max);
            result = isInRange;

            if (!isInRange) {
                break;
            }
        }
        StringBuilder s = new StringBuilder();
        if (result) s.append("passed");
        else        s.append("didn't pass");

        StdOut.printf("testUniformInt(int n) is %s\n", s.toString());
    }

    public static void testUniformInt2Args()
    {
        boolean result = false;
        int min = 3;
        int max = 10;
        int prev = StdRandom.uniformInt(min, max);

        for (int i = 1; i < trials; i++) {

            int  cur = StdRandom.uniformInt(min, max);
            boolean isSame = prev == cur;
            boolean isInRange = (cur >= min) && (cur < max);
            result = isInRange;

            if (!isInRange) {
                break;
            }
        }
        StringBuilder s = new StringBuilder();
        if (result) s.append("passed");
        else        s.append("didn't pass");

        StdOut.printf("testUniformInt(int n) is %s\n", s.toString());
    }




    public static void main(String[] args)
    {
        trials = Integer.parseInt(args[0]);

        testUniformDouble();
        testUniformInt();
    }
}
