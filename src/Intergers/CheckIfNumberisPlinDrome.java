package Intergers;

public class CheckIfNumberisPlinDrome {

    public static void main(String[] args) {

        int num = 121;
        int original = num;
        int reversed = 0;

        while(num !=0){
            int Lastdigit = num % 10;
            reversed = reversed * 10 + Lastdigit;
            num = num / 10;
        }

        if(original == reversed){
            System.out.println("Palindrome");
        }else {
            System.out.println("Non Palindrome");

        }

    }
}
