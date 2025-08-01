public class ex1_2_20 {

    public static void main(String[] args) {

        int a = 1;
        int b = 6;
        int sum = 0;
        int n = 2;

        for (int i = 0; i < n; i++) {

            int r = a + (int)(Math.random() * (b + 1 - a));
            sum += r;
            System.out.print(r + " ");
            System.out.println(sum);
        }
    }
}
