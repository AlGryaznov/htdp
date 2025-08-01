import java.awt.*;

public class p_3_1_6 {
    public static void main(String[] args) {

        Picture pic = new Picture(args[0]);
        int w = pic.width();
        int h = pic.height();
        Picture picR = new Picture(w, h);
        Picture picG = new Picture(w, h);
        Picture picB = new Picture(w, h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                Color c = pic.get(i, j);
                picR.set(i, j, new Color(c.getRed(), 0, 0));
                picG.set(i, j, new Color(0, c.getGreen(), 0));
                picB.set(i, j, new Color(0, 0, c.getBlue()));
            }
        }

        pic.show();

        picR.show();
        picG.show();
        picB.show();
    }
}
