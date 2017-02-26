package sda.filmWeb;

public class Main {
    public static void main(String[] args) {

        FilmBuilder filmBuilder = new FilmBuilder();

        Film film = filmBuilder
                .withTytul("Wielki mur")
                .withGatunek("Fantasy, Przygodowy")
                .withPremiera("13.01.2017")
                .withRezyser("Yimou Zhang")
                .witProducenci("Chiny, USA")
                .build();
        System.out.println(film.toString());
        Film film2 = filmBuilder
                .withTytul("Snowden")
                .withGatunek("Biograficzny, Sensacyjny, Thiller")
                .withPremiera("18.11.2016")
                .withRezyser("Oliver Stone")
                .witProducenci("Francja, Niemcy, USA")
                .build();
        System.out.println(film.toString());
    }
}
