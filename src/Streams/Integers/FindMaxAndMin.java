package Streams.Integers;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1,4,5,6,7,7,6,6);

        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();

        System.out.println(min);
        System.out.println(max);

    }
}
