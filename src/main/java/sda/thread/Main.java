package sda.thread;

public class Main {
    public static void main(String[] args) {

        Runnable runnable1 = new SDAThread(1);
        Runnable runnable2 = new SDAThread(2);
        Runnable runnable3 = new SDAThread(3);
        Runnable runnable4 = new SDAThread(4);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        Thread thread4 = new Thread(runnable4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("Tutaj skonczyl sie main");
    }
}
