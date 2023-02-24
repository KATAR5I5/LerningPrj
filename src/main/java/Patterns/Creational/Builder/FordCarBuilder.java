package Patterns.Creational.Builder;

public class FordCarBuilder extends CarBuilder {

    @Override
    void buildName() {
        car.setName("Ford");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTOMATIC);
    }

    @Override
    void buildSpeed() {
        car.setSpeed(150);
    }

}
