public class p_1_4_37 {

    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);

        int n = 13;
        int m = 4;
        int[][] set = {{5, 3, 3, 2},
                {4, 4, 3, 2},
                {4, 3, 3, 3}};
        int[] count = new int[set.length];

        for (int l = 0; l < trials; l++) {

            int[] deck = new int[52];
            int[][] hands = new int[4][4];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    deck[i * n + j] = i;
                }
            }
            /*
            for (int i = 0; i < deck.length; i++) {
                System.out.print(deck[i] + " ");
            }
            System.out.println();
            */
            for (int i = 0; i < deck.length; i++) {

                int r = i + (int) (Math.random() * (deck.length - i));
                int temp = deck[i];
                deck[i] = deck[r];
                deck[r] = temp;
            }
            /*
            for (int i = 0; i < deck.length; i++) {
                System.out.print(deck[i] + " ");
            }
            System.out.println();
            */
            for (int i = 0; i < n; i++) {


                for (int j = 0; j < m; j++) {

                    hands[j][deck[i * m + j]]++;
                }
            }
            /*
            for (int i = 0; i < hands.length; i++) {
                for (int j = 0; j < hands[0].length; j++) {

                    System.out.print(hands[i][j] + " ");
                }
                System.out.println();
            }*/

            for (int i = 0; i < hands.length; i++) {
                for (int k = 0; k < set.length; k++) {

                    boolean isEqual = true;
                    for (int j = 0; j < hands[0].length; j++) {

                        if (set[k][j] == hands[i][j]) {
                            isEqual = false;
                            break;
                        }
                    }

                    if (isEqual) {
                        count[k]++;
                    }
                }
            }
        }

        for (int i = 0; i < count.length; i++) {

            System.out.print( ((double)count[i] / (4 * trials)) + " ");
        }
        System.out.println();

    }
}

