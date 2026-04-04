package Streams.Strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyStream {

    public static void main(String[] args) {

        String str = "aabbbccdde";

        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(collect);
    }
}
