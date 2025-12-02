package School;

public class Teacher implements Person {
    private int id;
    private String name;
    private String teach;

    public Teacher(int id, String name, String teach) {
        this.id = id;
        this.name = name;
        this.teach = teach;
    }


    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String[] getData() {
        return new String[] {String.valueOf(id), name, teach};
    }
}
