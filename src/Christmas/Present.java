package Christmas;

import java.util.Random;

public class Present {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    Random rand = new Random();
    boolean random = rand.nextBoolean();

    public Present(boolean isSoft, boolean isRectangular, boolean doesRattle) {
        this.isSoft = random;
        this.isRectangular = random;
        this.doesRattle = random;
    }

    public boolean couldBeLego(Present p) {
        return isSoft && isRectangular && doesRattle;
    }

}
