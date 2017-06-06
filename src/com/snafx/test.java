package com.snafx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-06-05.
 */
public class test {
    public static void main(String[] args) {

        List<List<String>> nameList = Arrays.asList(
                Arrays.asList("Szymon", "Arek", "Wojciech", "Andrzej"),
                Arrays.asList("Mariola", "Anna", "Aleksander"));

        System.out.println("LIST\n");
        nameList.stream()
                .flatMap(e -> e.stream())
                .filter(e -> e.startsWith("A"))
                .sorted() //sortuje alfabetycznie
                .forEach(e -> System.out.println(e));

        System.out.println("\nMAP\n");
        Map<String, List<String>> map = new HashMap<>();
        map.put("men", Arrays.asList("Szymon", "Wojciech", "Andrzej"));
        map.put("woman", Arrays.asList("Anna", "Janina", "Aleksander"));

        map.entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .sorted()
                .forEach(e -> System.out.println(e));

        System.out.println("\n*****\n");
        List<String> names = Arrays.asList("Szymon", "Agnieszka", "Mariola", "Staszek", "Anna");
        names.stream()
                .filter(e -> e.endsWith("a"))
                .filter(e -> e.length() > 4)
                .forEach(e -> System.out.println(e));
    }
}
