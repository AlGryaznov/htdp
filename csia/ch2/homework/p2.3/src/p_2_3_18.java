import java.util.Arrays;

public class p_2_3_18 {

    public static void show_permutation_v2(char[] a, int n, int k)
    {
        if (a.length - n == k) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            System.out.println(sb.toString().substring(0,k));
        }

        for (int i = 0; i < n; i++) {

            swap(a, i, 0);
            show_permutation_v2(a, n - 1, k);
            swap(a, 0, i);
        }
    }
    public static void swap(char[] a, int i, int j) {

        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static char[] create_alphabet() {

        char[] alphabet;
        alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {

            alphabet[i] = (char) (0x61 + i);
        }
        return alphabet;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        char[] alphabet = create_alphabet();
        char[] a = Arrays.copyOfRange(alphabet, 0, n);

        show_permutation_v2(a, a.length, k);
    }
}
