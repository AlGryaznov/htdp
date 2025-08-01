public class p_1_4_38 {

    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        final int n = 365;
        long avg = 0;


        for (int l = 0; l < trials; l++) {

            boolean[] birthdays = new boolean[n];
            int count = 0;

            int r = 0;
            while (true) {

                count++;
                r = (int) (Math.random() * n);

                if (birthdays[r]) break;
                else              birthdays[r] = true;
            }
            System.out.println(count);
            avg += count;
        }
        System.out.println("Average number of people " + avg/trials);
    }
}