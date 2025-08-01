public class ex1_2_3 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;

        // (!(a && b) && (a || b)) || ((a && b) || !(a || b))
        // (!a || !b) && (a || b)) || ((a && b) || (!a && !b))


        System.out.println((!(a && b) && (a || b)) || ((a && b) || !(a || b)));
        a = true;
        b = false;
        System.out.println((!(a && b) && (a || b)) || ((a && b) || !(a || b)));
        a = false;
        b = true;
        System.out.println((!(a && b) && (a || b)) || ((a && b) || !(a || b)));
        a = false;
        b = false;
        System.out.println((!(a && b) && (a || b)) || ((a && b) || !(a || b)));
    }
}