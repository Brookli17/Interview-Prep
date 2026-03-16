package Intergers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SumOfIntegersInList {

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 7};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = sum;
        }

        System.out.println(Arrays.toString(arr));
    }
}
