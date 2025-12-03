package NewsLetter;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getLongestWord() {
        String[] words = body.split("\\W+");
        String longest = "";
        for (String s : words) {
            if (s.length() > longest.length()) {
                s = longest;
            }
        }
        return longest;
    }

    public ArrayList<String> getWords() {
        ArrayList<String> s = new ArrayList<>();
        String[] allWords = body.split("\\W+");

        for (String string: allWords) {
            if (!s.contains(string)) {
                s.add(string);

            }
        }

        return s;
    }

    @Override
    public String toString() {
        return "Heading: " + heading + " Body: " + body + " Author: " + author;
    }

}
