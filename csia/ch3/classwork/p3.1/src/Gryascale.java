import java.awt.*;

public class Gryascale {
    public static void main(String[] args) {

        Picture picture = new Picture(args[0]);
        picture.show();
        int height = picture.height();
        int width = picture.width();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                Color color = picture.get(i, j);
                picture.set(i, j, Luminance.toGray(color));
            }
        }
        picture.show();
    }
}
