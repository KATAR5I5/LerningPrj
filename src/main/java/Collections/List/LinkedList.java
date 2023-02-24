package Collections.List;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new java.util.LinkedList<>();
        measureTime(arrayList);
        measureTime(linkedList);
    }

    private static void measureTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        fillList(list);
        long endTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " время заполнения в КОНЕЦ - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        readList(list);
        endTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " время считывания - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        readArray(list);
        endTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " время считывания из массива - " + (endTime - startTime));

        list.clear();

        startTime = System.currentTimeMillis();
        addInStartList(list);
        endTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " время  заполнения В НАЧАЛО - " + (endTime - startTime) + "\n");

        System.out.println(list.indexOf(5));

    }

    private static void readList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    private static void readArray(List<Integer> list) {
        Integer[] array =  list.toArray(Integer[]::new);
        for (int i = 0; i < array.length; i++) {
            list.get(i);
        }
    }

    public static void fillList(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }

    public static void addInStartList(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
    }
}
