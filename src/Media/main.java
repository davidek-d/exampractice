package Media;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Audio a1 = new Audio("John", 1, "-10");
        Video v1 = new Video("Henrik", 10, "-4");

        ArrayList<Media> media = new ArrayList<>();
        media.add(a1);
        media.add(v1);

        System.out.println(media);

        try {
            File file = new File("information.txt");
            if (file.createNewFile()) {
                System.out.println("Sucess!");
            }
        } catch (IOException i) {
            throw new RuntimeException(i);
        }

        try {
            FileWriter fileWriter = new FileWriter("information.txt");
            fileWriter.write(String.valueOf(media));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
