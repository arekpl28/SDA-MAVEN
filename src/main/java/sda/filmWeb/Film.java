package sda.filmWeb;


public class Film {
    private String tytul;
    private String rezyser;
    private String gatunek;
    private String produkcja;
    private String premiera;

    public String getRezyser() {
        return rezyser;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getProdukcja() {
        return produkcja;
    }

    public void setProdukcja(String produkcja) {
        this.produkcja = produkcja;
    }

    public String getPremiera() {
        return premiera;
    }

    public void setPremiera(String premiera) {
        this.premiera = premiera;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rezyser='" + rezyser + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", produkcja='" + produkcja + '\'' +
                ", premiera='" + premiera + '\'' +
                '}';
    }
}
