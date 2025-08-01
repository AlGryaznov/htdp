public class p_2_1_14 {
    public static void main(String[] args)
    {
        int code = Integer.parseInt(args[0]);
        int sum = 0;
        final int n = 10;
        int[] a;
        a = new int[n];

        if (code <= 999999999) {
            System.out.println("bad argument");
            return;
        }

        for (int i = n - 1; i >= 0; i--) {

            int d = code % 10;
            code = code / 10;
            a[i] = d;
        }

        sum += a[0];
        System.out.print(a[0] + " ");
        for (int i = 1; i < n; i++) {

            int x = f(a[i]);
            sum += x;
            System.out.print(x + " ");
        }
        System.out.println((sum % 10));
    }

    public static int f(int digit)
    {
        int x = digit + digit;
        return (x / 10 + x % 10);
    }
}
