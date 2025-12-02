package School;

public class Student implements Person {
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String[] getData() {
        return new String[] {String.valueOf(id), name, email};
    }
}
