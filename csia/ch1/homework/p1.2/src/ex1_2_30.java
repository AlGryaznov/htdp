public class ex1_2_30 {

    public static void main(String[] args) {

        double v0 = Math.random();
        double v1 = Math.random();
        double v2 = Math.random();
        double v3 = Math.random();
        double v4 = Math.random();

        double avg = (v0 + v1 + v2 + v3 + v4) / 5.0;

        double max = Math.max(v0, v1);
        max = Math.max(max, v2);
        max = Math.max(max, v3);
        max = Math.max(max, v4);

        double min = Math.min(v0, v1);
        min = Math.min(min, v2);
        min = Math.min(min, v3);
        min = Math.min(min, v4);

        System.out.println(v0 + " " + v1 + " " + v2 + " " + v3 + " " +  v4);
        System.out.println("avg = " + avg);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
