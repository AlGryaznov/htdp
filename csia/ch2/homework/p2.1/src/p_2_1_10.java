public class p_2_1_10 {

    public static int lg(int n)
    {
        int i = 0;

        if (n >= 2) {

            int p = 1;
            while ((p = p * 2) <= n) {

                i++;
            }
        }
        return i;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(lg(n));
    }
}