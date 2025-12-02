package DreamOpgave;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private ArrayList<Dream> dreams = new ArrayList<>();

    public static void main(String[] args) {
        Main m = new Main();

        Dream d1 = new Dream("20-11-2025", 11, Type.NEUTRAL);
        Dream d2 = new Dream("23-02-2025", 5, Type.MARERIDT);
        Dream d3 = new Dream("11-05-2025", 15, Type.PROBLEMLØSENDE);

        m.dreams.add(d1);
        m.dreams.add(d2);
        m.dreams.add(d3);

        System.out.println(m.isPleasant(d3));

        System.out.println(d1.isPleasant());

        Collections.sort(m.dreams);
        System.out.println(m.dreams);
    }

    public boolean isPleasant(Dream dream) {
        if (dream.getType() == Type.PROBLEMLØSENDE && dream.getDuration() <= 10) {
            return true;
        }
        if (dream.getType() == Type.NEUTRAL && dream.getDuration() >= 10) {
            return true;
        } else {
            return false;
        }
    }
}