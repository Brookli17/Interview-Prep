package AllInOne;

import java.util.stream.Collectors;

public class RemoveDuplicateFromStringAndArray {

    public static void main(String[] args) {

        String s = "Programming";
        s = s.toLowerCase();

        boolean[] seen = new boolean[256];
        StringBuffer sb = new StringBuffer();


         for(char ch : s.toCharArray()) {
             if(!seen[ch]){
                 seen[ch] = true;
                 sb.append(ch);
             }
         }

        System.out.println(sb);

         //Using Strea


        String Result =  s.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Using Strema -> " + Result);
    }

}
