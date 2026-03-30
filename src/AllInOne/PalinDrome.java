package AllInOne;

public class PalinDrome {

    public static void main(String[] args) {

        String s ="DARSHAN";
        s = s.toLowerCase();

        int left = 0;
        int right = s.length()-1;
        boolean ispalinDrome = true;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)) {
                ispalinDrome = false;
                break;
            }

            left ++;
            right--;
        }

        if (ispalinDrome) {
            System.out.println("PalineDrome");
        } else {
            System.out.println("Non PalineDrome");
        }
    }

}
