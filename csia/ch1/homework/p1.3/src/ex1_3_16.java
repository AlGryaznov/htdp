public class ex1_3_16 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 2) {
            System.out.println(0);
            return;
        }

        int p = 1;
        int v = 2;

        while (v <= n) {
            System.out.print(p + " ");
            v *= 2;
            p++;
        }
        System.out.println();
    }
}
