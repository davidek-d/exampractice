package Cinema;

public class Main {
    public static void main(String[] args) {

        Movie m1 = new Movie(true, true, false);
        Movie m2 = new Movie(true, true, false);
        Movie m3 = new Movie(true, true, false);
        Movie m4 = new Movie(true, true, false);

        System.out.println(m1.couldBeAlien());
        System.out.println(m2.couldBeAlien());
        System.out.println(m3.couldBeAlien());
            System.out.println(m4.couldBeAlien());
        }
    }
