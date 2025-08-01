public class ex1_3_43 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int t = 0;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );


        if (a > b) {
            t = b;
            b = a;
            a = t;
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );


        if (c > d) {
            t = c;
            c = d;
            d = t;
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );


        if (b > d) {
            t = b;
            b = d;
            d = t;
            t = a;
            a = c;
            c = t;
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );


        if (c > e) {
            t = c;
            c = e;
            e = t;
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );


        if (b > e) {
            t = e;
            e = b;
            b = t;
            t = a;
            c = a;
            a = t;
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );


        if (b > c) {

            t = c;
            c = b;
            b = t;
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );

    }
}
