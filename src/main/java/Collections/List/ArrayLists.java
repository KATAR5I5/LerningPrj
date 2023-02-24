package Collections.List;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>(30);
//        names.add("Vasja");
//        List <String> fullNames = fillArrayListDontChange(names);
//        System.out.println(names);
//        System.out.println(fullNames);
//        clearAnyList(fullNames);
//        System.out.println(fullNames);
//       maxElem(List.of(847, 271, 663, 47, 3, 376, 133, 693, 13, 382, 879));
        maxElem(List.of());
        maxElem(null);


    }


    public static <T> void clearAnyList(List<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static List<String> fillArrayListDontChange(List<String> list) {
        List<String> listCopy = new ArrayList<>(list);
//            Collections.copy(listCopy,  list);
        for (int i = 0; i < 10; i++) {
            listCopy.add("name" + i);
        }
        return listCopy;
    }

    public static void maxElem(List<Integer> list) {
        List<Integer> copy1 = new ArrayList<>(list);
        copy1.sort(Integer::compareTo);
//        int result1 = copy1.get(list.size() - 1);
//        System.out.println(result1);

        System.out.println(list.stream().mapToInt(Integer::intValue).max().getAsInt());
        Iterator<Integer> iterator = list.iterator();
        int result2 = Integer.MIN_VALUE;
//        while ((iterator.hasNext())) {
//            result2 = Integer.max(iterator.next(), result2);
//            int temp = iterator.next();
//            if (temp > result2) {
//                result2 = temp;
//            }
//        }
//        System.out.println(result2);
//        int result3 = Collections.max(list);
//        System.out.println(result3);
//        int result4 = copy1.stream().max(Integer::compareTo).get();
//        System.out.println(result4);

    }
}