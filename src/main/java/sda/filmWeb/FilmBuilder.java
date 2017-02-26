package sda.filmWeb;

public class FilmBuilder {
    private Film film;

    public FilmBuilder() {
        film = new Film();
    }
    public FilmBuilder withTytul(String tytul){
        film.setTytul(tytul);
        return this;
    }

    public FilmBuilder withRezyser(String rezyser){
        film.setRezyser(rezyser);
        return this;
    }
    public FilmBuilder withGatunek(String gatunek){
        film.setGatunek(gatunek);
        return this;
    }
    public FilmBuilder witProducenci(String produkcja){
        film.setProdukcja(produkcja);
        return this;
    }
    public FilmBuilder withPremiera(String premiera){
        film.setPremiera(premiera);
        return this;
    }
    public Film build(){
        return film;
    }

}
