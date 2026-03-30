package AllInOne;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraysFreq {

    public static void main(String[] args) {

        List<Integer> list = java.util.Arrays.asList(3,2,5,6,7,5,4,4,3);

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> duplicates = new HashMap<>();

        for(Integer num : list){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
             if(entry.getValue() > 1){
                 duplicates.put(entry.getKey(),entry.getValue());
             }
         }

        System.out.println(map);
        System.out.println(duplicates);

        // Now using Stream

       Map<Integer, Long> freqMap = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println("Using Streram ->"+ freqMap);

        //Now find Fisrt non Reapting

        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(n -> n.getValue() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println("collect:::" + collect);
    }
}
