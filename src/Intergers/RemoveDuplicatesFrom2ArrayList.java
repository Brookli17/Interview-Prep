package Intergers;

import java.util.*;

public class RemoveDuplicatesFrom2ArrayList {
    public static void main(String[] args) {

        List<Integer> lsit1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> lsit2 = Arrays.asList(5, 9, 4, 4, 0, 8, 6, 3, 2);

        Set<Integer> set = new HashSet<>(lsit1);
        List<Integer> common = new ArrayList<>();


        for(Integer i : lsit2){
            if(set.contains(i)){
                common.add(i);
            }
        }

        System.out.println(common);

    }

}
