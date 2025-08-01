public class ex1_3_26 {
    public static void main(String[] args) {

        int stake  = Integer.parseInt(args[0]);
        int goal   = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        double p   = Double.parseDouble(args[3]);
        int n = Integer.parseInt(args[4]);
        int bets = 0;
        int wins = 0;

        for (int t = 0; t < trials; t++) {

            int cash = stake;
            for (int i = 0; i < n && cash > 0 && cash < goal; i++, bets++) {

                if (Math.random() < p) cash++;
                else cash--;
                if (cash == goal) wins++;

                //System.out.println("*".repeat(cash));
            }
            System.out.println("cash " + cash);
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # bets: " + bets/trials);
    }
}

