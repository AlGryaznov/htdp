public class p_1_4_12 {
    public static void main(String[] args) {

        int[] a = new int[args.length];
        int  total = 0;

        for (int i = 0; i < a.length; i++) {

            a[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < a.length; i++) {

            total += a[i];
        }

        int r = (int) (total * Math.random());
        int sum = 0;
        int event = -1;

        for (int i = 0; i < a.length && sum <= r; i++) {

            sum += a[i];
            event = i;
        }

        System.out.print(event);
    }
}
