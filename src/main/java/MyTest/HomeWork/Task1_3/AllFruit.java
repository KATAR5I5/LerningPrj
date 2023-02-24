package MyTest.HomeWork.Task1_3;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public abstract class AllFruit implements Fruit{
    private final String type;
    private final int weight;
    private final String origin;

    public AllFruit(String type, int weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllFruit allFruit = (AllFruit) o;
        return weight == allFruit.weight && type.equals(allFruit.type) && origin.equals(allFruit.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, origin);
    }

    @Override
    public <T> void sorting(T[] arr, Comparator<? super T> c) {
        Stream.of(arr).sorted(c).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
