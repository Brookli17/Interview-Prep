package Streams.Integers;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingAndPreversOrder {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,4,5,8);

       Integer firstNonReapting =  list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
//                .filter(i -> i.getValue() == 1)
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(firstNonReapting);



    }
}
