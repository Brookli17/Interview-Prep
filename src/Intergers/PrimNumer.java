package Intergers;

public class PrimNumer {

    public static  boolean isPrime(int num){
        if(num  <= 1){
            return  false;
        }
        for(int i=2; i< Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return  true;
    }

    public static void main(String[] args) {
       if(isPrime(1)){
           System.out.println("Prime No");
       }else {
           System.out.println("Non Prime");

       }
    }
}
