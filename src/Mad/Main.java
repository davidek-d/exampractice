package Mad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Vegetables v1 = new Vegetables("Cucumber", 15, "Winter");
        Vegetables v2 = new Vegetables("Carrot", 5, "Summer");
        FastFood f1 = new FastFood("MCD", 20, 1000);
        FastFood f2 = new FastFood("BK", 25, 1200);

        ArrayList<Food> foods = new ArrayList<>();

        foods.add(v1);
        foods.add(v2);
        foods.add(f1);
        foods.add(f2);

        File file = new File("foodinfo.txt");
        file.createNewFile();

        try {
            FileWriter fh = new FileWriter("foodinfo.txt");
            fh.write(foods.toString());
            fh.close();
        } catch (IOException i) {
            System.out.println("Fejl");
        }
    }
}
