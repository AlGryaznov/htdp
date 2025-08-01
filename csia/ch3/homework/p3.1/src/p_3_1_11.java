public class p_3_1_11 {

    public static void main(String[] args) {

        StdOut.println("String1 = " + args[0]);
        StdOut.println("String2 = " + args[1]);

        String s = p_3_1_10.complementWatsonCrick(args[0]);

        if (s.equals(args[1])){
            StdOut.println("It's palindrome");
        } else {
            StdOut.println("It isn't palindrome");
        }
    }
}
