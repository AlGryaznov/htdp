public class ex1_3_12 {

    public static void main(String[] args) {

        String align = "\t\t";
        String align1 = "\t\t\t";
        String align2 = "\t\t\t\t";

        System.out.print("log(n)" + align1);
        System.out.print("n" + align2 + align2);
        System.out.print("nlog(n)" + align);
        System.out.print("n^2" + align);
        System.out.print("n^3" + align);
        System.out.println("2^n");

        for (int i = 16; i <= 2048; i*=2) {

            System.out.print(Math.log(i) + align1);
            System.out.print(i + align2);
            System.out.print(i*Math.log(i) + align);
            System.out.print(i*i + align);
            System.out.print(i*i*i + align);
            System.out.println(Math.pow(2,i));

        }
    }
}
