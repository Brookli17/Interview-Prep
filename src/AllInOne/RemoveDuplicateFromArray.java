package AllInOne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {

        int[] arry = {1,2,3,4,3,4,3,2};

        //Using Streqm

        Arrays.stream(arry).distinct().forEach(System.out::print);

        Set<Integer> set = new HashSet<>();

        for(int num : arry){
            if(!set.contains(num)){
                set.add(num);
            }
        }

        System.out.println(set);

    }
}
