package Patterns.Creational.Builder;

public class Car {
    private String name;
    private Transmission transmission;
    private int speed;

    public Car(){};
    public Car(CarBuilderSimple carBuilder){};



    public void setName(String name) {
        this.name = name;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }








    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", transmission=" + transmission +
                ", speed=" + speed +
                '}';
    }
}
