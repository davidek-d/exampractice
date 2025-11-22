package InternationalMember;

public class InternationalMember {
    private String firstName;
    private String lastName;
    private String nationality;
    private int age;


    public InternationalMember(String firstName, String lastName, String nationality, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName +" "+lastName+" "+nationality+" "+age+" ";
    }

    public boolean commonName() {
        return nationality.equalsIgnoreCase("dansk")
                && (lastName.toLowerCase().endsWith("berg") || (lastName.toLowerCase().endsWith("sen")));
    }

    public boolean danishSeniorPlus() {
        return nationality.equalsIgnoreCase("dansk") && age > 50;
        }
    }
