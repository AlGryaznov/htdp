public class p_2_3_23 {

    public static int[] sort(int[] a) {

        int threshold = a.length - 1;


        while (threshold > 0) {

            int index = max(a, threshold);

            flip(a, index);
            flip(a, threshold);
            threshold--;
        }

        return a;
    }

    private static int[] flip(int[] a, int index) {

        index = index % a.length;

        for (int i = 0; i < index; i++, index--) {

            int t = a[i];
            a[i] = a[index];
            a[index] = t;
        }
        return a;
    }


    // Overview: Search index of max value of array
    private static int max(int[] a, int threshold) {

        threshold = threshold % a.length;
        int index = 0;

        for (int i = 1; i <= threshold; i++) {

            if (a[index] < a[i]) {

                index = i;
            }
        }
        return index;
    }

    /*   Example:
     *   Numbers describe size of pancakes
     *   Idea: search for max value, swap it with first and then swap last unsorted value
     *   with it
     *   Original sequence: 1 3 5 4 2
     *
     *   1 3 [5] 4 2 |  // search max
     *   [5] 3 1 4 2    // swap it
     *   2 4 1 3 | [5]  // swap with last unsorted and slide threshold
     *   2 [4] 1 3 | 5  // repeat all moves
     */

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 4, 2};

        sort(a);

        StdArrayIO.print(a);
    }
}
