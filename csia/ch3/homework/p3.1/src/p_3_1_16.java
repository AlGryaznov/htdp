public class p_3_1_16 {

    public static String getTopLvlDomainName(String s)
    {
        return s.substring(s.lastIndexOf('.') + 1);
    }

    public static void main(String[] args)
    {
        System.out.println(getTopLvlDomainName(args[0]));
    }
}
