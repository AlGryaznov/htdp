public class p_2_1_30 {

    public static int dayOfWeek(int day, int month, int year)
    {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public static boolean isLeapYear(int year) {

        boolean isLeapYear = ((year % 4) == 0);
        isLeapYear = isLeapYear && ((year % 100) != 0);
        isLeapYear = isLeapYear || ((year % 400) == 0);

        return isLeapYear;
    }

    public static void printCalendar(int month, int year) {

        String[] nameOfMonths = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] numberOfdaysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dow = dayOfWeek(1, month, year);
        month -= 1;
        int ndays = numberOfdaysInMonths[month];

        if ((month == 1) && isLeapYear(year)) {

            ndays++;
        }
        StdOut.printf("%s %d\n SUN MON TUE WED THU FRI SAT\n", nameOfMonths[month], year);

        for (int i = dow; i > 0; i--) {

            StdOut.print("    ");
        }

        for (int i = 1; i <= ndays; i++) {

            StdOut.printf("%4d", i);

            if (dow == 6) {
                StdOut.println();
            }
            if (dow >= 7) {

                dow = 1;
            } else {
                dow++;
            }
        }
    }

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        printCalendar(month, year);
    }
}
