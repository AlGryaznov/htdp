public class p_2_1_12 {
    public static void main(String[] args)
    {
        String s = "Hello";
        s = duplicate(s);
        String t = "Bye";
        t = duplicate(duplicate(duplicate(t)));
        StdOut.println(s + t);
    }

    public static String duplicate(String s)
    {
        String t = s + s;
        return t;
    }
}
