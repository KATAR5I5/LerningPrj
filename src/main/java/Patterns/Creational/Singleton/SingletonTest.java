package Patterns.Creational.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        VolvoCarSingleton volvo = VolvoCarSingleton.getVolvoCar();
        System.out.println(volvo);
        System.out.println(volvo.getName());

        VolvoCarSingleton volvo2 = VolvoCarSingleton.getVolvoCar();
        System.out.println(volvo2);
    }
}
