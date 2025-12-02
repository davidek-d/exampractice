package Database;

import java.lang.reflect.Array;
import java.util.Arrays;

public class User implements DataObject{
    private int ID;
    private String name;
    private String username;

    public User(int ID, String name, String username) {
        this.ID = ID;
        this.name = name;
        this.username = username;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String[] getData() {
        return new String[] { String.valueOf(ID), name, username};

    }
}
