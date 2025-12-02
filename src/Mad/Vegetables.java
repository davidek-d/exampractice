package Mad;

public class Vegetables extends Food {
    private String season;

    public Vegetables(String name, double price, String season) {
        super (name, price);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}
