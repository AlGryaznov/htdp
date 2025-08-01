public class ex1_2_19 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int r = 0;
        int n = 30;

        for (int i = 0; i < n; i++) {

            r = a + (int)(Math.random() * (b + 1 - a));
            System.out.print(r + " ");
        }
    }
}
