package Intergers;

import java.util.Arrays;

public class MoveAllNonZeroElementsToRight {
    public static void main(String[] args) {

        int[] arr = {0, 2, 4, 6, 0, 3, 5, 0};

        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
