package Media;

public class Video extends Media{
    private String aspectRatio;


    public Video(String name, int duration, String aspectRatio) {
        this.name = name;
        this.duration = duration;
        this.aspectRatio = aspectRatio;
    }

    @Override
    public String toString() {
        return name + " " + duration + " " + aspectRatio;
    }


}
