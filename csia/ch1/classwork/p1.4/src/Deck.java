public class Deck {
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

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }

        for (int i = 1; i < deck.length; i++) {

            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i - 1];
            deck[i - 1] = deck[r];
            deck[r] = temp;
        }

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
}