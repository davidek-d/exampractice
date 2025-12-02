package Company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Meeting m1 = new Meeting("10-01-2025", 70, Type.KONFLIKT);
        Meeting m2 = new Meeting("15-04-2025", 55, Type.OPSTART);
        Meeting m3 = new Meeting("20-03-2025", 150, Type.PLANLÆGNING);

        ArrayList<Meeting> meets = new ArrayList<>();

        meets.add(m1);
        meets.add(m2);
        meets.add(m3);

        Collections.sort(meets);
        System.out.println(meets);
    }
}

