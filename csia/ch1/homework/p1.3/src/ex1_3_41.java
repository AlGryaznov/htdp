public class ex1_3_41 {


    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);

        int c6 = 0;
        int c12 = 0;

        for (int i = 0; i < trials; i++) {

            int count = 0;

            for (int j = 0; j < 6; j++) {

                if (rollDice() == 1) {
                    count++;
                }
            }
            c6 += count;

            for (int j = 0; j < 6; j++) {
                if (rollDice() == 1) {
                    count++;
                }
            }
            c12 += count / 2;
            
        }

        //System.out.println("c6 = "  + c6);
        //System.out.println("c12 = " + c12);
        System.out.println("c6 = "  + c6/(6.0 * trials) * 100  + "%");
        System.out.println("c12 = " + c12/(6.0 * trials) * 100 + "%");
    }



    public static int rollDice() {

         return (int)Math.ceil(Math.random()/(1.0/6.0));
    }
}
