package com.snafx;

import java.util.Arrays;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class test {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Szymon", "Agnieszka", "Mariola", "Staszek", "Anna");
        names.stream()
                .filter(e -> e.endsWith("a"))
                .filter(e -> e.length() > 4)
                .forEach(e -> System.out.println(e));
    }
}
