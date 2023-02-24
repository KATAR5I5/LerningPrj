package Patterns.Creational.Builder;

public class Director {
    CarBuilder carBuilder;
    void setBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildSpeed();
        carBuilder.buildTransmission();
        return carBuilder.getCar();
    }

}
