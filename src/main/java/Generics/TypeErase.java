package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeErase {
    public static void main(String[] args) {


        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1.1, 2d, 3.3, 4.8, 5d));
    }

//    Т.к идет стирание типов нельзя таким образом ПЕРЕГРУЗИТЬ и ПЕРЕОПРЕДЕЛИТЬ методы (см ниже)
//    static void abs(List<Double> list) {
//    }
    static void abs(List<Integer> list) {
    }
}


