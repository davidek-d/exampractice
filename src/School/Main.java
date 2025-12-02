package School;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "John", "Biology");
        Student s1 = new Student(2, "Henrik", "henrik@mail.com");

        System.out.println(Arrays.toString(s1.getData()));
        System.out.println(Arrays.toString(t1.getData()));
    }
}
