package AllInOne;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FourthApril {
    public static void main(String[] args) {

        String s = "AaBbCcDdEeIZ";
        s = s.toLowerCase();

        java.lang.Character ch  = s.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(
                        i -> i,
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                        .stream()
                                .filter(c -> c.getValue() == 1)
                                        .map(Map.Entry::getKey).findFirst().orElse(null);


        Map<Character , Integer> map = new LinkedHashMap<>();

        System.out.println(ch);

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+ 1);
        }

        System.out.println(map);

        for(char c : s.toCharArray()){
            if(map.get(c) == 1){
                System.out.println(c);
                break;
            }
         }
    }
}
