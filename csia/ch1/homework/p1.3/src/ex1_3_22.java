public class ex1_3_22 {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = m;

        String s = "";
        int power = 1;

        while (power <= n/2) power *= 2;
        while (power > 0)
        {
            if (n < power)   { s += 0;             }
            else             { s += 1; n -= power; }
            power /= 2;
        }
        System.out.println(s);

        s = "";
        for (int i = m; i > 0 ; i /= 2) {

            s = (i % 2) + s;
        }
        System.out.println(s);
    }
}
