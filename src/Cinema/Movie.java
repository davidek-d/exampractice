package Cinema;

import java.util.Random;

public class Movie {
    private boolean isScary;
    private boolean isScifi;
    private boolean isFunny;

    Random rand = new Random();
    boolean random = rand.nextBoolean();

    public Movie (boolean isScary, boolean isScifi, boolean isFunny) {
        this.isScary = random;
        this.isScifi = random;
        this.isFunny = random;
    }

    public boolean couldBeAlien() {
        return isScary && isScifi && !isFunny;
    }
}
