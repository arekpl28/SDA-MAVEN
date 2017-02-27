package sda.adapter;

public class CarToPersonAdapter implements Person {
    private Car car;

    public CarToPersonAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.drive();
    }

    @Override
    public void say() {
        car.hort();
    }
}
