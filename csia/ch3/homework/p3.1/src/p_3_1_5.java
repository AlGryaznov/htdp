public class p_3_1_5 {
    public static void main(String[] args) {

        Picture pic = new Picture(args[0]);
        int w = pic.width();
        int h = pic.height();
        Picture picMirror = new Picture(w, h);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                picMirror.set(w - i - 1, j, pic.get(i, j));
            }
        }

        pic.show();
        picMirror.show();

    }
}
