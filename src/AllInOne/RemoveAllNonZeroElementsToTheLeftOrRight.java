package AllInOne;

import java.util.Arrays;

public class RemoveAllNonZeroElementsToTheLeftOrRight {

    public static void main(String[] args) {

        int [] arry = {1,9,0,7,0,1,0,8};
//
        int left = 0;

        for(int right =0 ; right < arry.length; right++){
            if(arry[right] == 0){
                int temp = arry[left];
                arry[left] = arry[right];
                arry[right] = temp;

                left ++;

            }
        }

        System.out.println(Arrays.toString(arry));

    }
}
