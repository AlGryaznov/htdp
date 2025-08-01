public class ex1_2_34 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min1 = Math.min(a,b);
        int min2 = Math.min(b,c);
        int min = Math.min(min1,min2);
        int mid = Math.max(min1,min2);
        int max = Math.max(Math.max(a,b), c);

        System.out.println(min + " " + mid + " " + max);
    }
}