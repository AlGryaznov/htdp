public class ex1_3_10 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double sum = 0;

        if (n == 0) {
            System.out.println("Division by zero");
            return;
        }

        for (int i = 0; i < n; i++) {

            double r = Math.random();
            sum += r;
            System.out.println(r);
        }

        System.out.println("average = " + sum/n);

    }
}
