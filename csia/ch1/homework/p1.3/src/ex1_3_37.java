public class ex1_3_37 {

    public static void main(String[] args) {

        int n = 2 * Integer.parseInt(args[0]);

        int i = n / 2;
        int j = n / 2;

        long steps = 0;

        while ((i != 0) && (j != 0) && (i != n - 1) && (j != n - 1)) {

            double r = Math.random();

            if      (r < 0.25) i++;
            else if (r < 0.50) i--;
            else if (r < 0.75) j--;
            else               j++;

            steps++;
        }

        System.out.println(steps);
    }
}
