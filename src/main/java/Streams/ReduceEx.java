package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
// Аккумулирует значения стрима по лямбда выражению
    static List<Integer> integerList = java.util.List.of(5, 8, 2, 4, 3);
    static List<String> stringsList = java.util.List.of("5", "6", "4", "5", "7", "8", "9", "5", "34", "2");
    static List<Integer> notElement = new ArrayList<>();
//    аккумулятор принимает сразу первое значение стрима Ex2
//    (или можно указать начальное значение Ex3, тогда метод GET не нужен, тк точно есть одно значение)
//    затем производит лямбда выражение, перезаписывая аккумулятор
//    возвращает OPTIONAL, если не указано точно начальное значение аккумулятора
//    поэтому нужен метод GET, чтоб получить значение
    public static void main(String[] args) {
// example 1
        Optional<Integer> optional = notElement.stream().reduce((accum, el)->accum+el);
        if(optional.isPresent()){
            System.out.println(optional);
        }else System.out.println("not element");
//        или
        try {
            System.out.println(optional.get());
        }catch (Exception e){
            System.out.println("упала на методе Get");
        }

// example 2
        int result = integerList.stream()
                .reduce((accumulator, element) -> accumulator*element).get();
        System.out.println(result);
//        5, 8, 2, 4, 3
//        accumulator = 5 40 80 320 960
//        element     = 8  2  4  3

//  example 3
        int result2 = integerList.stream()
                .reduce(1,(accumulator, element) -> accumulator * element);
        System.out.println(result2);


    }

}
