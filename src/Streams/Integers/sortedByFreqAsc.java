package Streams.Integers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class sortedByFreqAsc {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1,4,5,6,7,7,6,6);


        List<Map.Entry<Integer, Long>> collect = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
//                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                .collect(toList());

        System.out.println(collect);
    }
}
