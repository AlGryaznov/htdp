import java.util.ArrayList;
import java.util.Arrays;

public class p_2_3_17 {

    public static String get_permutation_v1(char[] a) {

        if (a == null) return "";
        if (a.length == 1) return a[0] + " ";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {

            swap(a, 0, i);
            String[] s = get_permutation_v1(Arrays.copyOfRange(a, 1, a.length)).split(" ");

            for (int j = 0; j < s.length; j++) {

                sb.append(a[0] + s[j] + " ");
            }

            swap(a, i, 0);
        }
        return sb.toString();
    }

    public static String get_permutation_v2(char[] a, int n) {

        StringBuilder result = new StringBuilder();
        if (n == 0) {
            return result.append(a).append(" ").toString();
        }

        for (int i = 0; i < n; i++) {

            swap(a, i, n - 1);
            String s = get_permutation_v2(a, n - 1);
            result.append(s);
            swap(a, n - 1, i);
        }

        return result.toString();
    }

    public static String get_permutation_v3(char[] a, int n) {

        StringBuilder result = new StringBuilder();
        if (n == 0) {
            return result.append(a).append(" ").toString();
        }

        for (int i = 0; i < n; i++) {

            swap(a, 0, i);
            String s = get_permutation_v3(a, n - 1);
            result.append(s);
            swap(a, i, 0);
        }

        return result.toString();
    }

    public static String get_permutation_v4(char[] a, int n) {

        ArrayList<String> sl = get_permutation_v4_helper(a, n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sl.size(); i++) {
            sb.append(sl.get(i));
        }
        return sb.toString();
    }
    public static ArrayList<String> get_permutation_v4_helper(char[] a, int n) {

        StringBuilder sb = new StringBuilder();
        ArrayList<String> sl = new ArrayList<String>();
        if (n == 0) {
            sl.add(sb.append(a).append(" ").toString());
            return sl;
        }

        for (int i = 0; i < n; i++) {

            swap(a, 0, i);
            sl.addAll(get_permutation_v4_helper(a, n - 1));
            swap(a, i, 0);
        }

        return sl;
    }


    public static void show_permutation_v1(char[] a, int n)
    {
        if (n == 0) System.out.println(a);

        for (int i = 0; i < n; i++) {

            swap(a, i, n - 1);
            show_permutation_v1(a, n - 1);
            swap(a, n - 1, i);
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
        char[] alphabet = create_alphabet();
        char[] a = Arrays.copyOfRange(alphabet, 0, n);

        StdOut.println(get_permutation_v4(a, a.length));
    }
}
