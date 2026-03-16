package Intergers;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,2,2,2,2,4,4,4);

        Map<Integer, Integer> map = new HashMap<>();

        for(Integer i : list){
            map.put(i , map.getOrDefault(i,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue() > 1){
               System.out.println(entry.getKey() + " -> " + entry.getValue());
           }
        }

    }
}
