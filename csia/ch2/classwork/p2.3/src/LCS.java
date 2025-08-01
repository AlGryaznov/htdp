public class LCS {
    public static String lcs(String s, String t)
    {
        int m = s.length();
        int n = t.length();

        int[][] opt = new int[m + 1][n + 1];

        for (int i = m - 1; i >= 0 ; i--) {
            for (int j = n - 1; j >= 0 ; j--) {
                if (s.charAt(i) == t.charAt(j))
                    opt[i][j] = opt[i+1][j+1] + 1;
                else
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
            }
        }

        String lcs = "";
        int i = 0, j = 0;

        while (i < m && j < n)
        {
            if (s.charAt(i) == t.charAt(j))
            {
                lcs += s.charAt(i);
                i++;
                j++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) i++;
            else                                 j++;
        }
        return lcs;
    }

    public static void main(String[] args)
    {
        StdOut.println(lcs(args[0], args[1]));
    }

}
