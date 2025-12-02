package Database;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student implements DataObject{
    private int ID;
    private String name;
    private String email;

    public Student(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String[] getData() {
        return new String[] { String.valueOf(ID), name, email};
    }
}
