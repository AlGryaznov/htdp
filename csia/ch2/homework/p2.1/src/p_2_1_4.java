public class p_2_1_4 {

    public static void main(String[] args)
    {
        int[] a1 = {1, 2, 3};
        int[] b1 = {1, 2, 3};
        System.out.println(eq(a1, b1));

        int[] a2 = {1, 2};
        int[] b2 = {1, 2, 3};
        System.out.println(eq(a2, b2));

        int[] a3 = {1, 0, 3};
        int[] b3 = {1, 3, 3};
        System.out.println(eq(a3, b3));

    }


    public static boolean eq(int[] a, int[] b)
    {
        boolean result = true;

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
