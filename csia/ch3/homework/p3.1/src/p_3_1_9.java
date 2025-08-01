public class p_3_1_9 {

    public static boolean isValidDNA(String s)
    {

        return s.matches("[ACTG,actg]+");
    }

    public static void main(String[] args) {

        StdOut.println(isValidDNA(args[0]));
    }
}
