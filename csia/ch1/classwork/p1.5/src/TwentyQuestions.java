public class TwentyQuestions {

    public static void main(String[] args) {

        //int n = Integer.parseInt(args[0]);
        int secret = 1 +  (int) (Math.random() * 1000000);
        StdOut.print("I'm thinking of a number ");
        StdOut.println("between 1 and 1,000,000");
        int guess = 0;

        while (guess != secret)
        {
            StdOut.print("What's your guess? ");
            guess = StdIn.readInt();
            if (guess == secret) StdOut.println("You win!");
            if (guess < secret) StdOut.println("Too low");
            if (guess > secret) StdOut.println("Too high");
        }
    }
}
