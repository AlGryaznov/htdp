public class ex1_2_15 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int ab = a + b;
        int ac = a + c;
        int cb = c + b;

        boolean result = (c >= ab) || (b >= ac) || (a >= cb);

        System.out.println(result);
    }
}
