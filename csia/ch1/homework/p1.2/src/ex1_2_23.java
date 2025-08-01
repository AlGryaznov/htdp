public class ex1_2_23 {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean result = ((m == 3) && (d >= 20) && (d <= 31))
                || ((m == 6) && (d >= 0) && (d <= 20))
                || ((m > 3) && (m < 6) && (d >= 0) && (d <= 31));



        System.out.println("result " + result);
    }
}
