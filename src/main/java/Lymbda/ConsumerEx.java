package Lymbda;

import java.util.function.Consumer;

public class ConsumerEx {
    //     Потребитель - потребляет (принимает в параметрах - изменяет в теле,
    //     но ничего не возвращает).


    public static void main(String[] args) {
        Consumer<CarCons> consumer = el -> {
            System.out.println(el.name.repeat(2));
        };


        changeCar(new CarCons("lada",
                1990), consumer);
    }

    public static void changeCar(CarCons car, Consumer<CarCons> consumer) {
        consumer.accept(car);
    }
}

class CarCons {
    String name;
    int year;

    public CarCons(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + '\'' +
                ", year=" + year +
                '}';
    }
}