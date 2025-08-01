public class ex1_3_32 {

    public static void main(String[] args) {

        long k = Long.parseLong(args[0]);
        long n = k;

        while(n > 0) {

            System.out.println(n);
            n *= k;
        }

    }
}
