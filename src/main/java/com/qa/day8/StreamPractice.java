package com.qa.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square =
                number.stream()
                        .map(x -> x * x)
                        .collect(Collectors.toList());


        square.forEach(System.out::print);


        List<String> exercise1 = Arrays.asList("Michael", "Dean", "James", "Chris");
        List<String> solution1 =
                exercise1.stream()
                        .map(x -> {
                            if (!x.equals("James")) {
                                return ("Hello" + x);
                            } else
                                return x;
                        })
                        .collect(Collectors.toList());

        exercise1.forEach(x -> {
            if (!x.equals("James"))
                System.out.printf("%n Hello %s", x);
            else System.out.printf("%n %s", x);
        });

    }

}
