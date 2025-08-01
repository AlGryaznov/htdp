public class Tables {
    public static void main(String[] args) {

        double[][] a = {
                { 99.0, 85.0, 98.0, 0.0},
                { 98.0, 57.0, 79.0, 0.0},
                { 92.0, 77.0, 74.0, 0.0},
                { 94.0, 62.0, 81.0, 0.0},
                { 99.0, 94.0, 92.0, 0.0},
                { 80.0, 76.5, 67.0, 0.0},
                { 76.0, 58.5, 90.5, 0.0},
                { 92.0, 66.0, 91.0, 0.0},
                { 97.0, 70.5, 66.5, 0.0},
                { 89.0, 89.5, 81.0, 0.0},
                {  0.0,  0.0,  0.0, 0.0},
        };

        int m = a[0].length - 1;
        int n = a.length - 1;

        for (int i = 0; i < n; i++) {

            double sum = 0.0;
            for (int j = 0; j < m; j++) {
                sum += a[i][j];
            }

            a[i][m] = sum / m;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[n][j] += a[i][j];
            }
        }

        for (int j = 0; j < m; j++) {
            a[n][j] = a[n][j] / n;
        }


        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
