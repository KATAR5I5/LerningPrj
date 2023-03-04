package MyTest;

import javax.print.DocFlavor;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReaderTXT {
    public static void main(String[] args) throws FileNotFoundException {
        Path path = Path.of("C:\\Users\\User\\Desktop\\javatxt.txt");
        FileReader fr = new FileReader(path.toString());
        BufferedReader buff = new BufferedReader(fr);
//        FileWriter fw = new FileWriter(path.toString(),true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        try {
            List<String> stringList = Files.lines(path)
                    .collect(Collectors.toList());

            List<String> stringList2 =  stringList .stream()
                    .filter(el->!(stringList.indexOf(el)%3==0))
                            .collect(Collectors.toList());
            System.out.println(stringList2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}

