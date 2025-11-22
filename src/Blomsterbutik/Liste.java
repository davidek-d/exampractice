package Blomsterbutik;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Liste {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        int d = rand.nextInt(10);
        int e = rand.nextInt(10);

        Blomst b1 = new Blomst("Lilje", "F", a);
        Blomst b2 = new Blomst("Lilje", "S", b);
        Blomst b3 = new Blomst("Lilje", "B", c);
        Blomst b4 = new Blomst("Lilje", "G", d);
        Blomst b5 = new Blomst("Lilje", "F", e);

        ArrayList<Blomst> blomst = new ArrayList<>();

        blomst.add(b1);
        blomst.add(b2);
        blomst.add(b3);
        blomst.add(b4);
        blomst.add(b5);

        Collections.sort(blomst);
        Collections.reverse(blomst);
        System.out.println(blomst);


        try {
            File file = new File("blomster.txt");
            file.createNewFile();

        } catch (IOException i) {
            throw new RuntimeException(i);
        }

        try {
            FileWriter writer = new FileWriter("blomster.txt");
            writer.write(String.valueOf(blomst));
            writer.close();
        } catch (IOException i) {
            throw new RuntimeException(i);
        }

    }
}
