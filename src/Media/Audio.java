package Media;

public class Audio extends Media {
    private String loudness;

    public Audio(String name, int duration, String loudness) {
        this.name = name;
        this.duration = duration;
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        return name + " " + duration + " " + loudness;
    }
}
