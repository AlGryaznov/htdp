public class p_2_1_2 {
    public static void main(String[] args)
    {
        test_odd(false,false,false);
        test_odd(true,true,true);
        test_odd(false,false,true);
        test_odd(true,false,true);
        test_odd(true,true,false);
    }

    public static void test_odd(boolean a1, boolean a2, boolean a3)
    {
        System.out.printf("odd(%b,%b,%b) = %b\n",a1, a2, a3, odd(a1, a2, a3));
    }


    public static boolean odd(boolean a1, boolean a2, boolean a3)
    {
        int x = Boolean.compare(a1, false)
              + Boolean.compare(a2, false)
              + Boolean.compare(a3, false);

        return (x % 2) != 0;
    }
}
