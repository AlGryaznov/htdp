import edu.princeton.cs.algs4.StdIn;

public class p_1_5_28 {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);

        String[] s = StdIn.readAllLines();
        int n = s.length;

        int[] perm = new int [n];

        for (int i = 1; i < n; i++) {

            perm[i] = i;
        }
        for (int i = 1; i < m; i++) {

            int r = i + (int)(Math.random() * (n - i));
            int temp = perm[i];
            perm[i] = perm[r];
            perm[r] = temp;
        }

        for (int i = 0; i < m; i++) {
            System.out.println(s[perm[i]]);
        }



    }
}
