package sda.builder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonAddress address = new PersonAddress();
        address.setCity("Poznan");
        address.setStreet("Baraniaka 88");
        address.setPostCode("60-111");

        Person person = personBuilder
                .withFirstName("Jan")
                .withLastName("Kowalski")
                .withPesel("23214321421")
                .withPersonAddress(address)
                .build();
        System.out.println(person.toString());
    }
}
