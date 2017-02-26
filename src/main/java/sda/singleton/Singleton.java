package sda.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private static int counter = 0;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return "Singleton";
    }
}
