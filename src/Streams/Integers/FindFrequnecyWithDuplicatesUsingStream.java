package Streams.Integers;

import java.util.*;
import java.util.stream.Collectors;

public class FindFrequnecyWithDuplicatesUsingStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1,4,5,6,7,7,6,6);
        
       Set<Integer> duplicates =  list.stream().collect(Collectors.groupingBy(
                i -> i,
                Collectors.counting()
        )).entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
