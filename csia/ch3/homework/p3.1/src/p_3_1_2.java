import java.awt.*;

public class p_3_1_2 {
    public static void main(String[] args) {

        int code = Integer.parseInt(args[0]);
        final int w = 256;
        final int h = 256;

        Color c = new Color(code);

        Picture p = new Picture(w, h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                p.set(i, j, c);
            }
        }
        p.show();
    }
}
