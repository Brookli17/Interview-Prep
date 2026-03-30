package Intergers;

import java.util.Map;

public class MaxSubarraySum {

    public static void main(String[] args) {

            int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int max = arr[0];
        int currenrtSubArray = arr[0];

        for(int i = 1; i<arr.length; i++){

            //Decide to stat a new Subarry or Extend a new
            //By comparing current ->  curent  + prevoius
            currenrtSubArray = Math.max(arr[i] , currenrtSubArray + arr[i]);

            //Update Max if Current sum Excened the Limit
            max = Math.max(currenrtSubArray, max);
        }

        System.out.println(max);
    }
}
