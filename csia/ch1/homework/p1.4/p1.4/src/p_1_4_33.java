public class p_1_4_33 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] a;
        a = new int[n];
        boolean isNoDuplicate = true;

        for (int i = 0; i < a.length; i++) {

            a[i] = i + 1;
        }

        for (int i = 0; i < a.length; i++) {

            int r = i + (int)(Math.random() * (a.length - i));
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }

        //a[3] = a[6];

        int i = 0;
        while ((i < a.length) && isNoDuplicate) {

            int j = i + 1;
            while ((j < a.length) && (a[i] != a[j])) {
                j++;
            }
            isNoDuplicate = (j == a.length);
            i++;
        }

        if (isNoDuplicate) {

            System.out.print("There is no duplicates");

        } else {

            System.out.print("There is duplicates");
        }

            

    }
}
