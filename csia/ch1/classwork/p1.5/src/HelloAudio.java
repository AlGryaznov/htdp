public class HelloAudio {

    public static void main(String[] args) {

        double base = Double.parseDouble(args[0]);
        int SAMPLING_RATE = 44100;
        double duration = 1.0;
        int m = 12;
        int n = (int) (SAMPLING_RATE * duration);
        double[] a = new double[n+1];

        for (int i = 0; i <= m; i++) {

            double hz = base * Math.pow(2, i/12.0);
            StdOut.printf("%4.2f ", hz);

            for (int j = 0; j <= n; j++) {
                a[j] = Math.sin(2 * Math.PI * j * hz / SAMPLING_RATE);
                //StdOut.println(j + " " + a[j]);
            }
            StdAudio.play(a);
        }
        StdOut.println();


    }
}

