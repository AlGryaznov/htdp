public class ex1_3_31 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int x = j + 1;
                int y = i + 1;


                do {
                    int r = x % y;

                    if (r == 0) {
                        break;
                    }
                    x = y;
                    y = r;

                } while(true);


                if (y != 1) { System.out.print(" "); }
                else            { System.out.print("*"); }
            }
            System.out.println();
        }
    }
}
