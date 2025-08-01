public class p_2_3_9 {

    public static String ruler(int n)
    {
        if (n <= 0) return "";

        return ruler(n - 1) + n + ruler(n - 1);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {

            StdOut.println(ruler(i));
        }
    }
}
