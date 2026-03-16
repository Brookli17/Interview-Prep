package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateInterger {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,1,2,3);

        int [] arr = {1,2,3,4,1,2,3};

        //Usingh Dynamic ArryList
        List<Integer> list1 =
                list.stream()
                .distinct()
                .filter(
                n -> n % 2 == 0
        ).skip(1).toList();

        System.out.println(list1);



        //Using Dfault Fixed Size Arry
        int[] array = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(array));


    }
}
