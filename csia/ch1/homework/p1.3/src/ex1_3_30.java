public class ex1_3_30 {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);


        System.out.println("x = " + x + ", y = " + y);


        do {
            int r = x % y;

            if (r == 0) {
                break;
            }
            x = y;
            y = r;

        } while(true);


        System.out.println(y);
    }
}
