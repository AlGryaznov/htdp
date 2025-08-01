import java.util.Arrays;

public class p_3_1_17 {

    public static String reverseDomainName(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] names = s.split("\\.");

        System.out.println(s);
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));

        for (int i = names.length - 1; i >= 1; i--) {

            sb.append(names[i]).append('.');
        }
        sb.append(names[0]);
        return sb.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(reverseDomainName(args[0]));
    }
}
