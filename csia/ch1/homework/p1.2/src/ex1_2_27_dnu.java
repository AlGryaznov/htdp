public class ex1_2_27_dnu {

    public static void main(String[] args) {

        double u = Math.random();
        double v = Math.random();

        double r = Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u));


        System.out.println("r " + r);
    }
}
