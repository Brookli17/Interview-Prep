package AllInOne;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFreq {

    public static void main(String[] args) {

        String s = "AaBbCcDdEeh";
        s = s.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1 ) {
                System.out.println("firstNot Repating char " + ch);
                break;
            }
        }

        System.out.println("Freq using not Map -> " +  map);


        //Now Using Strwma


      Map<Character, Long> map2 =   s.chars()
                .mapToObj( c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(map2);



        Map<Character, Long> firstNonRep =   s.chars()
                .mapToObj( c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                 .stream()
                 .filter(c -> c.getValue() == 1)
                 .collect(Collectors.toMap(
                         Map.Entry::getKey,
                         Map.Entry::getValue
                 ));

        System.out.println(firstNonRep);

    }
}
