package Images;

public class main {
    public static void main(String[] args) {
        Image i1 = new Image("john.txt", 10, 5);
        Image i2 = new Image("john.png", 15, 51);
        Image i3 = new Image("john.jpg", 10, 90);

        System.out.println(i1.isKnownFileType());
        System.out.println(i1.isPortrait());
        System.out.println(i1.isLandscape());

        System.out.println(i2.isKnownFileType());
    }
}
