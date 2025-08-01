public class ex1_3_42 {

    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);

        int prize = 0;
        int pick = 0;
        int d1 = 0;
        int d2 = 0;
        int proposal = 0;

        int countAccept = 0;
        int countDecline = 0;

        for (int i = 0; i < trials; i++) {

            double r = Math.random();
            if      (r < 1.0/3.0) prize = 1;
            else if (r < 2.0/3.0) prize = 2;
            else                  prize = 3;

            r = Math.random();
            if (r < 1.0/3.0) {
                pick = 1;
                d1 = 2;
                d2 = 3;
            }
            else if (r < 2.0/3.0) {
                pick = 2;
                d1 = 1;
                d2 = 3;
            }
            else {
                pick = 3;
                d1 = 1;
                d2 = 2;
            }

            if (prize == d1) {

                proposal = d1;

            } else if (prize == d2) {

                proposal = d2;

            } else {
                r = Math.random();
                if (r < 0.5) proposal = d1;
                else proposal = d2;
            }

            if (proposal == prize)  countAccept++;
            if (pick == prize)      countDecline++;
        }

        System.out.println("number of wins on accept " + ((double)countAccept)/trials);
        System.out.println("number of wins on decline " + ((double)countDecline)/trials);

    }
}
