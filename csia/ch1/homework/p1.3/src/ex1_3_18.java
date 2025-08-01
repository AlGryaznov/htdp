public class ex1_3_18 {

    public static void main(String[] args) {

        int n = 1000000;
        double sum = 0;

       /* only d because product of i * i  will be to high for fit into int*/

        for (int i = 1; i <= n; i++) {
            sum +=  1 / (1.0 * i * i);

            System.out.println(sum);
        }

        System.out.println(Math.sqrt(sum * 6));
    }
}
