package Patterns.Structural.Proxy;

public class Car implements Driven {
    public String name;

    public Car(String name) {
        this.name = name;
    }



    @Override
    public void drive() {
        System.out.println("This is Car method" + name);
    }
}
