package Patterns.Creational.Builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildName();

    abstract void buildTransmission();

    abstract void buildSpeed();

    Car getCar() {
        return car;
    }
}
