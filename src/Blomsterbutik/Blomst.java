package Blomsterbutik;

public class Blomst implements Comparable<Blomst> {
    private String navn;
    private String farve;
    private int længde;

    public Blomst(String navn, String farve, int længde) {
        this.navn = navn;
        this.farve = farve;
        this.længde = længde;
    }

    public String getNavn() {
        return navn;
    }

    public String getFarve() {
        return farve;
    }

    public int getLængde() {
        return længde;
    }

    public void setLængde(int input) {
        this.længde = input;
    }

    @Override
    public String toString() {
        return navn + " " + farve + " " + længde;
    }


    @Override
    public int compareTo(Blomst o) {
        return Integer.compare(this.længde, o.getLængde());
    }
}
