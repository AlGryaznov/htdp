public class p_1_4_23 {

    public static void main(String[] args) {

        int[] a = { 1, 0, 2, 3, 7, 7, 12, 12, 6, 9, 5, 11, 4, 7, 7, 6};
        int[] b = { 1, 0, 2, 3, 7, 7, 0, 6, 6, 9, 11, 11, 11, 7, 7, 13};
        int[] c = { 1, 0, 11, 11, 7, 7, 0, 6, 6, 9, 11, 11, 11, 7, 7};
        int[] e = { 1, 0, 11, 11, 11, 11, 0, 6, 6, 9, 11, 11, 11, 7, 7};

        int[] d;
        d = c;
        int n = d.length;
        int peak = d[0];
        int peakLength = 1;


        int max = d[0];
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (max < d[i]) {

                count = 1;
                max = d[i];

            } else if (max > d[i]) {

                if (peak < max) {

                    peak = max;
                    peakLength = count;

                } else if ((peak == max) && (count > peakLength)) {

                    peakLength = count;
                }
                count = 0;

            } else {

                count++;
            }
        }
        if (peak < max) {

            peak = max;
            peakLength = count;
        }

        System.out.println("peak = " + peak + ",peakLength = " + peakLength);
    }
}
