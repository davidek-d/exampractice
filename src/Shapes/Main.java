package Shapes;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);
        Circle c3 = new Circle(10);
        Square s1= new Square(3);
        Square s2= new Square(8);
        Square s3= new Square(15);

        ArrayList<Shape> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (Shape s : list) {
            System.out.printf(Locale.GERMANY, "%,.2f%n", s.getArea());
        }
    }
}
