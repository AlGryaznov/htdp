public class p_3_1_21 {

    public static void main(String[] args) {

        while(!StdIn.isEmpty()) {

            String s = StdIn.readLine();

            if (!s.matches("(\\s|\t)+")){

                StdOut.println(s);
            }
        }
    }
}
