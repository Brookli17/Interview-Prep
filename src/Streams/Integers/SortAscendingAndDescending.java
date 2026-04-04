package Streams.Integers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAscendingAndDescending {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1,4,5,6,7,7,6,6);

        List<Integer> asec= list.stream().sorted().toList();
        System.out.println(asec);

        List<Integer> desc = list.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(desc);


    }
}
