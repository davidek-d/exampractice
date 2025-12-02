package Christmas;
import Christmas.Present;

public class Main {

    public static void main(String[] args) {
        Present p = new Present(true, true, true);

        System.out.println(p.couldBeLego(p));

    }
}
