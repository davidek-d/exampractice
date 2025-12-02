package DreamOpgave;

public class Dream implements Comparable<Dream> {
    private String date;
    private int duration;
    private Type type;

    public Dream(String date, int duration, Type type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public Type getType() {
        return type;
    }

    public void setDate(String input) {
        this.date = input;
    }

    public boolean isPleasant() {
        if (type == Type.MARERIDT) { return false; }
        if (type == Type.NEUTRAL) {return duration > 10; }
        if (type == Type.PROBLEMLØSENDE) {return duration < 10;}
        return false;
    }


    @Override
    public String toString() {
        return date + " " + duration + " " + type + " ";
    }

    @Override
    public int compareTo(Dream o) {
        return this.date.compareTo(o.date);
    }
}
