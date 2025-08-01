public class p_1_6_4 {
    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        double[][] p = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = StdIn.readDouble();
            }
        }

       /*
        *   1. Вариант
        *   проверять таблицу вероятностей перед имитацией
        *   и рапортовать об ошибке
        */

        int page = 0;
        int[] freq = new int[n];

        for (int t = 0; t < trials; t++) {

           /*
            * 2. Вариант
            * значения выходящие за 1 игнорировать
            *
            * 3. Вариант
            * значения выходящие за 1 принимать за последний интервал
            *
            * 4. Вариант
            * производить скалирование переменной r относительно максимальной суммы
            */

            double r = Math.random();
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += p[page][i];
                if (r < sum) {  // в случае если будет больше 1, данное условие будет не корректно выполнятся и переход на страницы будет ограничен первой страницей превышающей 1
                    page = i; break;
                }
            }
            freq[page]++;
        }

        for (int i = 0; i < n; i++) {
            StdOut.printf("%8.5f", (double)freq[i] / trials);
        }
        StdOut.println();

    }
}