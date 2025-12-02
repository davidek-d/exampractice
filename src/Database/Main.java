package Database;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "John", "john123");
        Student s1 = new Student(2, "Henrique", "henriq3004@email.com");

        ArrayList<DataObject> alist = new ArrayList<>();

        alist.add(u1);
        alist.add(s1);

        for (DataObject a : alist) {
            System.out.println(Arrays.toString(a.getData()));
        }

    }
}
