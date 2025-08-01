public class ex1_3_35 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int sum = 0;
        int d = 0;

        for (int i = 2; i < 11; i++) {

            d = a % 10;
            sum += d * i;
            a = a / 10;
        }
        System.out.println("sum = " + sum);

        int r = sum % 11;

        if (r == 0) {
            d = 0;
        } else {
            d = 11 - r;
        }

        String s = args[0];

        if (d == 10) {
            s += "x";
        } else {
            s += Integer.toString(d);
        }

        System.out.println("ISBN = " + s);
    }
}
