package Collections.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Stepik2 {
    static String list = "1 177 8 700 785 4635 3489 52 7418 43 36 8695 3 64";

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(list);

        ArrayList<Integer> div2list = new ArrayList<>();
        ArrayList<Integer> div3list = new ArrayList<>();
        ArrayList<Integer> otherlist = new ArrayList<>();

        //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists
        bigList.stream()
                .forEach(e -> {
                    if (e % 2 == 0 || e % 3 == 0) {
                        if (e % 2 == 0) div2list.add(e);
                        if (e % 3 == 0) div3list.add(e);
                    } else otherlist.add(e);
                });

        //get result list from createListOfLists
//        as
        List<List<Integer>> resultList = List.of(div2list, div3list, otherlist);
        resultList.stream().forEach(Collections::sort);


//        List<List<Integer>> resultList2 = createListOfLists(resultList.toArray(new List[0]));


        //call printInLine() for resultList
        printInLine(resultList);
    }

    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<Integer>();
        String[] strarr = str.split(" ");

        for (String s : strarr) {
            //convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements from srtarr to bigList

//            bigList.add(Integer.parseInt(s));
            bigList.add(Integer.valueOf(s));
        }
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer>... lists) {
        return Arrays.asList(lists);
    }

    static void printInLine(List<List<Integer>> lists) {
        String result = lists.stream()
                .map(lst -> lst.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.joining(";\n"));
        System.out.println(result);
    }
}
