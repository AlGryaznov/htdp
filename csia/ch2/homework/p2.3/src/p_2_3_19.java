import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class p_2_3_19 {


    public static void combinations(String s) {
        StdOut.print("  ");
        combinations("", s);
    }

    public static void combinations(String prefix, String rest) {

        if (rest.length() == 1) {

            StdOut.print(prefix + rest + " ");
            return;
        }
        int len = rest.length();

        for (int i = 0; i < len; i++) {

            String s = prefix + rest.charAt(i);
            StdOut.print(s + " ");
            combinations(s, rest.substring(i + 1));
        }
    }


    public static char[] create_alphabet() {

        char[] alphabet;
        alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {

            alphabet[i] = (char) (0x61 + i);
        }
        return alphabet;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        char[] alphabet = create_alphabet();
        char[] a = Arrays.copyOfRange(alphabet, 0, n);


        combinations(String.valueOf(a));
    }
}
