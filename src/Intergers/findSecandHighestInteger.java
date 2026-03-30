package Intergers;

public class findSecandHighestInteger {
    public static void main(String[] args) {

        int[] arr = {10, 20, 19, 8};

        int fisrtMax = Integer.MIN_VALUE;
        int SecandMax = Integer.MIN_VALUE;


        for(int num : arr){
            if(num > fisrtMax){
                SecandMax =  fisrtMax;
                fisrtMax =  num;
            }else if(num > SecandMax && num != fisrtMax){
                SecandMax =  num;
            }
        }

        System.out.println("2nd highest Numer -> " + SecandMax);
        System.out.println("1st fisrtMax Numer -> " + fisrtMax);

    }
}
