import java.util.Arrays;

public class p_2_1_20 {

    public static void printa(String[] a)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {

            sb.append(String.format("%s, ", a[i]));
        }
        StdOut.printf("%s\n", sb.toString());
    }

    public static void shuffle(String[] deck) {

        for (int i = 1; i < deck.length; i++) {

            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i - 1];
            deck[i - 1] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[] perm(String[] a, int m) {

        String[] b = a.clone();

        if ((m > 0) && (m <= a.length))
        {
            for (int i = 1; i < m; i++) {

                int r = i + (int)(Math.random() * (b.length - i));
                String temp = b[i - 1];
                b[i - 1] = b[r];
                b[r] = temp;
            }
        }

        return b;
    }


    public static String[] getFiveCards(String[] deck) {

        String [] deckOfFive = new String[5];

        for (int i = 0; i < deckOfFive.length; i++) {

            deckOfFive[i] = deck[i];
        }
        return deckOfFive;
    }

    public static void main(String[] args) {

        String [] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        //int i = (int) (Math.random() * RANKS.length);
        //int j = (int) (Math.random() * SUITS.length);

        String[] deck = new String[SUITS.length * RANKS.length];

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {

                deck[i * SUITS.length + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        int n = Integer.parseInt(args[0]);

        /*
        for (int i = 0; i < n; i++) {
            shuffle(deck);
            printa(getFiveCards(deck));
        }*/

        for (int i = 0; i < n; i++) {
            printa(getFiveCards(perm(deck, 5)));
        }

    }
}
