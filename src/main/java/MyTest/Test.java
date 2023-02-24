package MyTest;

import java.util.*;

public class Test {
    static Integer [] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int [] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static void main(String[] args) {
     List<int []> listInt = Arrays.asList(arrayInt);
     List<Integer> listInteger = Arrays.asList(arrayInteger);
     List<Integer> l = Arrays.asList(1,2,3);

//        System.out.println(Arrays.asList(arrayInt).contains(1));
//        System.out.println(Arrays.asList(arrayInteger).contains(1));

        System.out.println(Arrays.asList(arrayInt).get(0).getClass().getSimpleName());
        System.out.println(Arrays.asList(arrayInteger).get(0).getClass().getSimpleName());
        System.out.println(Arrays.asList(1,2,3).get(0).getClass().getSimpleName());

        Set<Integer> num1 = new HashSet<>();

        num1.add(3);
        num1.add(7);
        num1.add(9);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(5);
        num2.add(7);
        num2.add(12);

        Set<Number> result = symmetricDifference(num1, num2);
        System.out.println(result);
    }


    static void method(int num) {
        int first = num;
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> temp = new HashSet<>(set1);
        Set<T> temp2 = new HashSet<>(set2);
        temp.removeAll(set2);
        temp2.removeAll(set1);
        temp.addAll(temp2);


        return temp;
    }

}
