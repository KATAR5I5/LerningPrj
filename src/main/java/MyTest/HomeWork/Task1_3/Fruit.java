package MyTest.HomeWork.Task1_3;

import java.util.Comparator;

public interface Fruit {
    public String getType();
    public int getWeight();
    public String getOrigin();

   public <T> void sorting(T[] arr, Comparator<? super T> c);

}
