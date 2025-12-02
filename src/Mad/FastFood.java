package Mad;

public class FastFood extends Food {
    private int calories;

    public FastFood(String name, double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
}
