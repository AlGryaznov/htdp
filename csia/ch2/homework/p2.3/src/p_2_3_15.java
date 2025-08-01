public class p_2_3_15 {

    public static String binary_remainders(int n)
    {
        StringBuilder sb = new StringBuilder();
        while (n > 1) {

            int r = n % 2;
            n = n / 2;
            sb.append(r);
        }
        return sb.append(n).toString();
    }

    public static String reverse(String s)
    {
        if ((s == null) || (s.length() == 1)) return s;
        return  reverse(s.substring(1)) + s.charAt(0);
    }

    public static String binary_represetation_recursive_comb(int n)
    {
        return reverse(binary_remainders(n));
    }

    public static String binary_represetation_recursive_aio(int n)
    {
        if (n <= 1) return Integer.toString(n);
        int d = n / 2;
        int r = n % 2;
        return binary_represetation_recursive_aio(d) + Integer.toString(r);
    }

    public static String binary_represetation(int n)
    {
        //return binary_represetation_recursive_aio(n);
        return binary_represetation_recursive_comb(n);

    }

    public static void main(String[] args)
    {
        StdOut.println(binary_represetation(7));
        StdOut.println(binary_represetation(8));
        StdOut.println(binary_represetation(0));
        StdOut.println(binary_represetation(1));
    }
}
