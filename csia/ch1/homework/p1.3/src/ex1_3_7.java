public class ex1_3_7 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        for (; i < 10; i++) {
            j += i;
        }
        System.out.println(i + " " + j);

        i = 0;
        j = 1;
        for (; i < 10; i++) {
            j += i;
        }
        System.out.println(i + " " + j);

        j = 0;
        for (;j < 10; j++) {
            j += j;
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);

        i = 0;
        j = 0;
        for (; i < 10; i++) {
            j += j++;
        }
        System.out.println(i + " " + j);
    }
}
