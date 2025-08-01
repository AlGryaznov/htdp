public class ex1_3_5 {
    public static void main(String[] args) {

        double t = Integer.parseInt(args[0]);
        double p = 0;

        int[] s = new int [6];

        for (int i = 0; i < t; i++) {

            p = Math.random();

            if (p < 0.125) {
                s[0]++;
            } else if ((p >= 0.125) && (p < 0.250)) {
                s[1]++;
            } else if ((p >= 0.250) && (p < 0.375)) {
                s[2]++;
            } else if ((p >= 0.375) && (p < 0.5)) {
                s[3]++;
            } else if ((p >= 0.5) && (p < 0.625)) {
                s[4]++;
            } else {
                s[5]++;
            }
        }

        System.out.println("1 - " + (s[0]/t)*100 + " %");
        System.out.println("2 - " + (s[1]/t)*100 + " %");
        System.out.println("3 - " + (s[2]/t)*100 + " %");
        System.out.println("4 - " + (s[3]/t)*100 + " %");
        System.out.println("5 - " + (s[4]/t)*100 + " %");
        System.out.println("6 - " + (s[5]/t)*100 + " %");
    }
}
