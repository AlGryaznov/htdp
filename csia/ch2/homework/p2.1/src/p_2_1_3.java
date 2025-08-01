public class p_2_1_3 {
    public static void main(String[] args)
    {
        test_majority(false,false,false);
        test_majority(true,true,true);
        test_majority(false,false,true);
        test_majority(true,false,true);
        test_majority(true,true,false);
    }

    public static void test_majority(boolean a1, boolean a2, boolean a3)
    {
        System.out.printf("majority(%b,%b,%b) = %b\n",a1, a2, a3, majority(a1, a2, a3));
    }
    public static boolean majority(boolean a1, boolean a2, boolean a3)
    {
        return (a1 && a2) || (a2 && a3) || (a1 && a3);
    }
}
