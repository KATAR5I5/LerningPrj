package Patterns.Creational.Singleton;

public class VolvoCarSingleton {
    private static VolvoCarSingleton volvoCar;

    private String name = "Volvo";
    private int yearManufactured = 2014;

    private VolvoCarSingleton() {
    }

    public static VolvoCarSingleton getVolvoCar() {
        if (volvoCar == null) {
            return volvoCar = new VolvoCarSingleton();
        }
        return volvoCar;
    }

    public String getName() {
        return name;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ",\nyearManufactured=" + yearManufactured;
    }
}
