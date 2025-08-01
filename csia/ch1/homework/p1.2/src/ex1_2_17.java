public class ex1_2_17 {

    public static void main(String[] args) {

        int a = 1;
        a = a + a; // 2
        a = a + a; // 4
        a = a + a; // 8
        System.out.println("a = " + a);

        boolean b = true;
        b = !b;
        b = !b;
        b = !b; // false
        System.out.println("b = " + b);

        int c = 2;
        c = c * c; // 4
        c = c * c; // 16
        c = c * c; // 256
        System.out.println("c = " + c);
    }
}
