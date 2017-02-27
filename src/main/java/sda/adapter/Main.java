package sda.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new CarImpl();
        Person person = new PersonImpl();

        CarToPersonAdapter carToPersonAdapter = new CarToPersonAdapter(car);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(carToPersonAdapter);

        for (Person personFormList : personList) {
            personFormList.move();
            personFormList.say();
        }
        System.out.println();
        PersonToCarAdapter personToCarAdapter = new PersonToCarAdapter(person);

        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(personToCarAdapter);

        for (Car carFormList : carList) {
            carFormList.drive();
            carFormList.hort();
        }
    }
}
