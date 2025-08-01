
public class UseArgument {
    public static void main(String[] args) {
        System.out.println("Program called ");

        int len = args.length;
        for (int i = 0; i < len; i++) {

            System.out.println("Arg[" + i + "] - " + args[i]);
        }

    }
}