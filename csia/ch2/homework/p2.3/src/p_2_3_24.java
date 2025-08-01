import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class p_2_3_24 {


    private static void println(char[] s)
    {
        StringBuilder sb = new StringBuilder();
        StdOut.println(sb.append(s).toString() );
    }

    public static void moves(int n, boolean enter, char[] s)
    {
        if (n == 0) return;
        moves(n - 1, true, s);

        int index = s.length - n;

        if (enter) s[index] = '1';
        else       s[index] = '0';
        println(s);

        moves(n - 1, false, s);
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        char[] s;
        s = new char[n];

        for (int i = 0; i < n; i++) {

            s[i] = '0';
        }

        moves(n, true, s);
    }
}


