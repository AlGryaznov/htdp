public class p2_4_3 {

    /* 3 3
       1 0 1
       0 0 1
       1 1 0

        flow(0, 0)
            flow(1, 0)
                if (!isOpen[i][j]) return;
            flow(0, 1)
                if (!isOpen[i][j]) return;
            flow(0, -1)
                if (j < 0 || i >= n) return;
            flow(-1, 0)
                if (i < 0 || j >= n) return;
        flow(0, 1)
            if (!isOpen[i][j]) return;
        flow(0, 2)
            flow(1, 2)
                flow(2, 2)
                    if (!isOpen[i][j]) return;
                flow(1, 3)
                    if (i < 0 || j >= n) return;
                flow(1, 1)
                     if (!isOpen[i][j]) return;
                flow(0, 2)
                    if (isFull[i][j]) return;
            flow(0, 3)
                if (i < 0 || j >= n) return;
            flow(0, 1)
                if (!isOpen[i][j]) return;
            flow(-1, 2)
                if (i < 0 || j >= n) return;

     */



}
