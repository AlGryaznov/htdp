public class PowersOfTwo {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int power = 1;

        int i = 0;
        while (i <= 30) {
            System.out.println(i + " " + power);
            power = 2 * power;
            i += 1;
        }
    }
}
