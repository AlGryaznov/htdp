public class p_1_5_23 {

    public static void main(String[] args) {

        double volume = Double.parseDouble(args[0]);
        double pace = Double.parseDouble(args[1]);

        int SAMPLING_RATE = 44100;
        while (!StdIn.isEmpty()) {

            int pitch = StdIn.readInt();
            double duration = pace * StdIn.readDouble();
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int n = (int) (SAMPLING_RATE * duration);
            double[] a = new double[n+1];

            for (int i = 0; i <= n; i++) {
                a[i] = volume * Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
            }
            StdAudio.play(a);
        }
    }
}
