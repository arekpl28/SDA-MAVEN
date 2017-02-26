package sda.observer;

public class Observer {
    public void react(int value) {
        System.out.println("Wartość " + value + " zostala zmieniona na: "+Math.abs(value));
    }

}
