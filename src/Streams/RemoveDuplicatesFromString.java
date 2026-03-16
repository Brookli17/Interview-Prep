package Streams;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String s = "AABBCCDDEESAHJH";


        String collect = s.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(collect);
    }
}
