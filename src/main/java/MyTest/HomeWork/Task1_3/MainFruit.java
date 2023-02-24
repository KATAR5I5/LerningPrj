package MyTest.HomeWork.Task1_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFruit {
    public static void main(String[] args) {
        Fruit[] fruits = getFruitArray();
        System.out.println(Arrays.toString(fruits) + "\n-------------------------------\n");

        Comparator<Fruit> compType = (f1, f2) -> f1.getType().compareTo(f2.getType());
        Comparator<Fruit> compWeight = (f1, f2) -> Integer.compare(f1.getWeight(), f2.getWeight());
        Comparator<Fruit> compOrigin = (f1, f2) -> f1.getOrigin().compareTo(f2.getOrigin());

//3.0 -y
        System.out.println("---Sorting---");
        UtilsForFruits.sorting(fruits, compType);
        UtilsForFruits.sorting(fruits, compWeight);
        UtilsForFruits.sorting(fruits, compOrigin);
//3.1 -y
        Fruit lemon = new Lemon("Lemon-6", 2, "Абхазия");
        System.out.println("\n---Index of find---");
        int result =
                UtilsForFruits.findIndexOfElementObject(fruits, lemon, compWeight);
        System.out.println(result);
//3.2 -y
        System.out.println("\n---Find MAX, MIN, AVERAGE---");
        var maxWeight = UtilsForFruits.findForWeight(fruits, TypeFound.MAX);
        var minWeight = UtilsForFruits.findForWeight(fruits, TypeFound.MIN);
        var averageWeight = UtilsForFruits.findForWeight(fruits, TypeFound.AVERAGE);
        System.out.println(maxWeight);
        System.out.println(minWeight);
        System.out.println(averageWeight);
//3.3
        Map<Integer,Fruit> map1 = new HashMap<>();
        Map<Integer,Fruit> map2 = new HashMap<>();



    }


    static Fruit[] getFruitArray() {
        Fruit melon1 = new Melon("Melon-1", 3, "Абхазия");
        Fruit melon2 = new Melon("Melon-2", 2, "Грузия");
        Fruit melon3 = new Melon("Melon-3", 7, "Азербайджан");
        Fruit melon4 = new Melon("Melon-4", 44, "Бразилия");
        Fruit melon5 = new Melon("Melon-5", 9, "Россия");
        Fruit melon6 = new Melon("Melon-6", 6, "ОАЭ");

        Fruit lemon1 = new Lemon("Lemon-1", 12, "Грузия");
        Fruit lemon2 = new Lemon("Lemon-2", 16, "ОАЭ");
        Fruit lemon3 = new Lemon("Lemon-3", 26, "Бразилия");
        Fruit lemon4 = new Lemon("Lemon-4", 11, "Азербайджан");
        Fruit lemon5 = new Lemon("Lemon-5", 19, "Россия");
        Fruit lemon6 = new Lemon("Lemon-6", 2, "Абхазия");

        Fruit[] fruits =
                {lemon4, melon5, lemon2, melon1, melon6, lemon6, melon3, lemon1, melon2, lemon3, melon4, lemon5};
        return fruits;
    }


    static Map<Integer,Fruit> getMapFruit(){
        List<Fruit> temp = Arrays.asList(getFruitArray());
        Collections.shuffle(temp);
//        temp.stream().collect(Collectors.toMap()


        return null;
    }
}
