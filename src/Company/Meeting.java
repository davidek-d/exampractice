package Company;

public class Meeting implements Comparable<Meeting> {
    private String date;
    private int duration;
    private Type type;

    public Meeting(String date, int duration, Type type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public String getDate() {
        return date;
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

    public boolean externalParticipant(Meeting m) {
        if (type == Type.KONFLIKT) {
            return true;
        }
        if (type == Type.OPSTART && duration > 60) {
            return true;
        }
        if (type == Type.PLANLÆGNING && duration > 120) {
            return true;
        }
        return false;
    }




    public String toString() {
        return date + " " + duration + " " + type;
    }

    @Override
    public int compareTo(Meeting o) {
        return this.date.compareTo(o.date);
    }
}
