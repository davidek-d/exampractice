package Thegym;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BMI b1 = new BMI(1.8, 85);
        BMI b2 = new BMI(1.6, 55);
        BMI b3 = new BMI(1.7, 110);

        ArrayList<BMI> list = new ArrayList<>();
        list.add(b1);
        list.add(b3);
        list.add(b2);

        for (BMI b : list) {
            System.out.println(b);

            System.out.println(b.calculateBMI());
            System.out.println(b.isUnderWeight());
            System.out.println(b.isNormalWeight());
            System.out.println(b.isOverWeight());
        }
    }
}
