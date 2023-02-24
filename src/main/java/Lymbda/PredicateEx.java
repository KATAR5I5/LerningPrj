package Lymbda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {
//    boolean test (T value)

    public static void main(String[] args) {

        List<RussianCar> listCars = new ArrayList<>();
        listCars.add(new RussianCar("Vaz 21099", 1990));
        listCars.add(new RussianCar("Niva", 1995));
        listCars.add(new RussianCar("Vaz 2105", 1999));
        listCars.add(new RussianCar("Vaz 2104", 1991));
        listCars.add(new RussianCar("Vaz 2108", 2001));


        Predicate<RussianCar> rusCar = el -> el.getDateManufactured() < 1996;
        System.out.println(
                listCars.stream()
                        .filter(rusCar)
                        .collect(Collectors.toList())
        );
    }
}


class RussianCar {
    private String model;
    private int dateManufactured;

    public String getModel() {
        return model;
    }

    public int getDateManufactured() {
        return dateManufactured;
    }

    public RussianCar(String model, int dateManufactured) {
        this.model = model;
        this.dateManufactured = dateManufactured;

    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", dateManufactured=" + dateManufactured
                ;
    }
}