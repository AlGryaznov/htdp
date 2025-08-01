public class p_1_4_7 {
    public static void main(String[] args) {

        final int n = 10;
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 9 - i;
        for (int i = 0; i < n; i++)
            a[i] = a[a[i]];

        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
