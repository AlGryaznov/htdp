public class p_1_4_22 {

    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        int[] frequencies = new int[13];
        double[] sums = new double[13];

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {

                frequencies[i + j]++;

            }
        }

        double[] probabilities = new double[13];
        for (int i = 0; i <= 12 ; i++) {
            probabilities[i] = frequencies[i] / 36.0;
        }

        for (int i = 0; i <= 12 ; i++) {

            System.out.print("frequencies[" + i + "] = " + frequencies[i]);
            System.out.println(", probabilities[" + i + "] = " + probabilities[i]);
        }

        for (int j = 0; j < trials; j++) {

            int sum = 0;
            int r = 1 + (int) (Math.random() * 6);
            sum += r;
            r = 1 + (int) (Math.random() * 6);
            sum += r;

            sums[sum]++;
        }

        for (int i = 0; i < sums.length ; i++) {

            System.out.println("sum[" + i + "] = " + sums[i] / trials);
        }
    }
}
