public class p_1_5_24 {

    public static void main(String[] args) {

        String filename = args[0];
        double v = Double.parseDouble(args[1]);

        double[] a = StdAudio.read(filename + ".wav");
        double[] b;

        System.out.println("a.length = " + a.length);

        if (v == 1) {

            b = a;
            System.out.println("b.length = " + b.length);

        } else if (v < 1) {

            b = new double[(int)Math.ceil(a.length * v)];
            System.out.println("b.length = " + b.length);
            for (int i = 0; i < b.length; i++) {

                b[i] = a[i];
            }

        } else {

            b = new double[(int)Math.ceil(a.length * v)];
            System.out.println("b.length = " + b.length);

            int q = (int)Math.floor(v);
            int r = b.length - q * a.length;
            int step = (int)Math.floor(((double)a.length - 1) / r);

            if (step <= 0) step = 1;

            System.out.println("step = " + step);
            System.out.println("q = " + q);
            System.out.println("r = " + r);

            int j = 1;
            int n_skip = step - 1;
            q -= 1;
            b[0] = a[0];
            for (int i = 1; i < a.length; i++) {


                if (r > 0) {

                    if (n_skip != 0) {

                        n_skip--;

                    } else {

                        n_skip = step;
                        b[j] = (a[i] + a[i - 1]) / 2;
                        r--;
                        j++;
                    }
                }

                for (int k = 0; k < q; k++) {

                    b[j] = (b[j - 1] + a[i]) / 2;
                    j++;
                }

                b[j] = a[i];
                j++;
            }
            System.out.println("j = " + j);
        }

        StdAudio.play(b);
    }
}