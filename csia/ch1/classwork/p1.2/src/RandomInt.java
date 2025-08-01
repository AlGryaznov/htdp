public class RandomInt {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double r = Math.random();      // равномерное расперделение от 0 до 1
        int value = (int) (r * n);  // равномерное расперделение от 0 до n-1

        System.out.println(value);

    }
}
