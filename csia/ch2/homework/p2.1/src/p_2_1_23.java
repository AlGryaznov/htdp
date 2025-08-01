public class p_2_1_23 {

    public static int getCoupon(int n) {

        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;
        double p0 = 1 - 1.0/(1000*n);

        int rareVal = (int)(Math.random() * n);
        int exchgVal = 0;
        int addVal = 1;

        if (rareVal != n - 1) {

            addVal = 0;
            exchgVal = n - 1;
        }

        StdOut.printf("p = %10.8f\n", p0);
        StdOut.printf("n = %d\n", n);
        StdOut.printf("rare value = %d\n", rareVal);
        StdOut.printf("exchaning value = %d\n", exchgVal);


        while (distinct < n)
        {
            double p = Math.random();

            int r = 0;

            if (p < p0) {

                r = addVal + (int)(p * (n - 1));

                if (r == rareVal) {

                    r = exchgVal;
                }

            } else {

                r = rareVal;
            }


            count++;
            if (!isCollected[r])
            {
                distinct++;
                isCollected[r] = true;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        System.out.println(getCoupon(n));
    }
}
