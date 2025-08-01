public class p_3_1_15 {

    public static boolean isCircularShift(String s, String t)
    {
        return (s + s).contains(t);
    }



    public static void main(String[] args)
    {
        System.out.println(isCircularShift(args[0], (args[1])));
    }
}
