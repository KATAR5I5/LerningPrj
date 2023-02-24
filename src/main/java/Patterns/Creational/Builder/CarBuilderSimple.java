package Patterns.Creational.Builder;

public class CarBuilderSimple {
    private String name = "anyCarName";
    private Transmission transmission = Transmission.MANUAL;
    private int speed = 100;


    public CarBuilderSimple setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilderSimple setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilderSimple setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
    public Car build(){
        Car car = new Car(this);
        car.setName(name);
        car.setSpeed(speed);
        car.setTransmission(transmission);
        return car;
    }
}
