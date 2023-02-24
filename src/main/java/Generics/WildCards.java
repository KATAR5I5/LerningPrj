package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
//        так можно
        List<?> listString = new ArrayList<String>(Arrays.asList("hi", "hallo", "ok"));
        showListInfo(listString);
//        Не может добавить(изменить) в листе, т.к не знает какой тип там лежит TypeSafe!!!
//        listString.add("why?");

        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1.1, 2d, 3.3, 4.8, 5d));
        showListInfo(listInteger);
        System.out.println(summ(listInteger));
        System.out.println(summ(listDouble));

//        листу параметризованному WildCard можно присвоить любой лист
        listString = listInteger;
        showListInfo(listString);

//      bounded wildcards
        List<? extends Number> listExt = new ArrayList<Integer>();
        List<? super Integer> listSup = new ArrayList<Number>();


//        так нельзя
//        List<T> list = new ArrayList<String>();
//        List<Number> list = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Integer>();
    }


    //       метод принимает совершенно любой List
    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    static double summ(List<? extends Number> list) {
        double summa = 0;
        for (Number el : list) {
            summa += el.doubleValue();
        }
        return summa;
    }
}
