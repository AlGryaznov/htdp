public class p_3_1_22 {

    public static boolean hasSubSequences(String str, String start, String end)
    {
        int lenStart = start.length();
        int lenEnd = end.length();
        int len = str.length();
        boolean result = false;

        if ((len >= lenStart + lenEnd)
        && (str.startsWith(start) && str.endsWith(end)))
        {
            String substr = str.substring(lenStart, len - lenEnd);

            if (!(substr.contains(start) || substr.contains(end)))
                result = true;
        }

        return result;
    }

    public static void main(String[] args)
    {
        StdOut.printf("String - %s, start sequence - %s, end sequence - %s\n", args[0], args[1], args[2]);
        StdOut.pri
    ntf("has subsequence? %b\n", hasSubSequences(args[0], args[1], args[2]));
    }
}
