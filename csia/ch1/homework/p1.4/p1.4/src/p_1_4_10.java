public class p_1_4_10 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9",
                          "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[SUITS.length * RANKS.length];

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }
/*
        for (int i = 0; i < deck.length; i++) {

            System.out.println(deck[i]);
        }
*/
        for (int k = 0; k < n; k++) {

            System.out.print((k + 1) + "\t");

            for (int i = 1; i < deck.length; i++) {

                String s = deck[i - 1];
                int r = i + (int) (Math.random() * (deck.length - i));

                deck[i - 1] = deck[r];
                deck[r] = s;
            }

            for (int i = 0; i < 5; i++) {

                System.out.print(deck[i] + "|");
            }
            System.out.println();
        }


    }
}
