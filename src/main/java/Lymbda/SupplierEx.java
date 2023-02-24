package Lymbda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
//      Производитель - ничего в параметрах не принимает, только возвращает Т
//        T get();

        List<Car> ourCArs = createTreeCar(() -> new Car("Volvo", "grey", 2014));

        ourCArs.forEach(System.out::println);
    }

    public static ArrayList<Car> createTreeCar(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }
}

class Car {
    private String name;
    private String color;
    private int year;

    public Car(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}


