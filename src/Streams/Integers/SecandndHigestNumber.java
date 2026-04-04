package Streams.Integers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecandndHigestNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,4,5,6,4,89,23);

        Integer secaondHighest = list
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).
                findFirst()
                .orElse(null);
        System.out.println(secaondHighest);
    }
}
