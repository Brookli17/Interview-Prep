package Streams.Integers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementWithHighestFrequency {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,2);

         Integer higestFreq = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(higestFreq);


    }
}
