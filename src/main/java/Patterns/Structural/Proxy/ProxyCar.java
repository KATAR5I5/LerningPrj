package Patterns.Structural.Proxy;

public class ProxyCar implements Driven {
    String carName;
    private Car car;

    public ProxyCar(String carName) {
        this.carName = carName;
    }

    @Override
    public void drive() {
        car = new Car(carName);
        System.out.println("This is proxy method");
        car.drive();
    }
}

