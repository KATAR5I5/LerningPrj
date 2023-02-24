package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect_gruping_partition {

    static List<Integer> integerList1 = List.of(5, 213,6, 4, 9, 10, 11, 9, 10, 11);


    public static void main(String[] args) {

//        Collectors.groupingBy
//        Возвращает МАР разложив на группы,
//        где ключ это параметр группы
//        а значение - List элементов коллекции

        Map<Integer, List<Object>> map = integerList1
                .stream()
                .collect(Collectors.groupingBy(el -> String.valueOf(el).length()));

        for (Map.Entry<Integer,List<Object>> e: map.entrySet()){
            System.out.println(e.getKey() +": "+ e.getValue());
        }
        System.out.println("\n***************************************\n");

//        Collectors.partitioningBy
//        Возвращает МАР разложив на группы true/false,
//        где ключ это Boolean
//        а значение - List элементов коллекции

        Map <Boolean, List<Integer>> mapPartition = integerList1.stream().collect(Collectors.partitioningBy(el->el>10));
        for (Map.Entry<Boolean,List<Integer>> e: mapPartition.entrySet()){
            System.out.println(e.getKey() +": "+ e.getValue());
        }
    }
}
