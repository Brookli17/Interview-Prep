package Streams.Integers;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1,4,5,6,7,7,6,6);

        list.stream().distinct().toList().forEach(System.out::print);


    }
}
