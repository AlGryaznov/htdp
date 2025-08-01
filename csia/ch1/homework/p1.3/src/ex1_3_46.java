public class ex1_3_46 {

    public static void main(String[] args) {

        long s = -1;

        for (long m = 1; m < Integer.MAX_VALUE; m++) {

            s = m * m * m * m * m;
            for (long i = 1; i < m; i++) {

                long si = s - i * i * i * i * i;
                if (si < 0) {
                    break;
                }

                for (long j = 1; j < m; j++) {

                    long sj = si -  j * j * j * j * j;
                    if (sj < 0) {
                        break;
                    }

                    for (long k = 1; k < m; k++) {

                        long sk = sj - k * k * k * k * k;
                        if (sk < 0) {
                            break;
                        }

                        for (long l = 1; l < m; l++) {


                                long sl = sk - l * l * l * l * l;

                                if (sl < 0) {
                                    break;
                                }
                                else if (sl == 0) {

                                    System.out.println(
                                            "a = "   + i +
                                            "; b = " + j +
                                            "; c = " + k +
                                            "; d = " + l +
                                            "; e = " + m) ;
                                    break;
                                }
                        }
                    }
                }
            }
            
        }


    }
}
