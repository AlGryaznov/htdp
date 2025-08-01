public class p_2_1_25 {

    public static int birthdayExperiment() {

        final int n = 365;
        int count = 0;
        boolean[] birthdays = new boolean[n];

        int r = 0;
        while (true) {

            count++;
            r = (int) (Math.random() * n);

            if (birthdays[r]) break;
            else              birthdays[r] = true;
        }
        return count;
    }

    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        long avg = 0;

        for (int l = 0; l < trials; l++) {

            int count = birthdayExperiment();
            System.out.println(count);
            avg += count;
        }
        System.out.println("Average number of people " + avg/trials);
    }

}
