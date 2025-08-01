public class p_1_5_27 {

    public static void main(String[] args) {

        int SAMPLING_RATE = 44100;

        StdDraw.enableDoubleBuffering();
        StdDraw.setYscale(-4, 4);

        while (!StdIn.isEmpty()) {

            int pitch = StdIn.readInt();
            double duration = 1.5 * StdIn.readDouble();
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int n = (int) (SAMPLING_RATE * duration);
            double[] a = new double[n+1];

            StdDraw.setXscale(0, n);

            double xp = 0;
            double yp = 0;
            StdDraw.clear();
            for (int i = 1; i <= n; i++) {

                a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
                StdDraw.line(xp, yp,  i, a[i]);
                xp = i;
                yp = a[i];
            }

            StdDraw.show();
            StdAudio.play(a);
        }
    }
}
